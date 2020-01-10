module Api exposing
    ( Request
    , request
    , send
    , map
    , withBasePath
    , withTimeout
    , withTracker
    , withHeader
    , withHeaders
    )

import Http
import Json.Decode
import Json.Encode
import Url.Builder


type Request a =
    Request
        { method : String
        , headers : List Http.Header
        , basePath : String
        , pathParams : List String
        , queryParams : List Url.Builder.QueryParameter
        , body : Http.Body
        , decoder : Json.Decode.Decoder a
        , timeout : Maybe Float
        , tracker : Maybe String
        }


request : String -> String -> List ( String, String ) -> List (String, Maybe String) -> List (String, Maybe String) -> Maybe Json.Encode.Value -> Json.Decode.Decoder a -> Request a
request method path pathParams queryParams headerParams body decoder =
    Request
        { method = method
        , headers = headers headerParams
        , basePath = "http://localhost:9000"
        , pathParams = interpolatePath path pathParams
        , queryParams = queries queryParams
        , body = Maybe.withDefault Http.emptyBody (Maybe.map Http.jsonBody body)
        , decoder = decoder
        , timeout = Nothing
        , tracker = Nothing
        }


send : (Result Http.Error a -> msg) -> Request a -> Cmd msg
send toMsg (Request req) =
    Http.request
        { method = req.method
        , headers = req.headers
        , url = Url.Builder.crossOrigin req.basePath req.pathParams req.queryParams
        , body = req.body
        , expect = Http.expectJson toMsg req.decoder
        , timeout = req.timeout
        , tracker = req.tracker
        }


map : (a -> b) -> Request a -> Request b
map fn (Request req) =
    Request
        { method = req.method
        , headers = req.headers
        , basePath = req.basePath
        , pathParams = req.pathParams
        , queryParams = req.queryParams
        , body = req.body
        , decoder = Json.Decode.map fn req.decoder
        , timeout = req.timeout
        , tracker = req.tracker
        }

withBasePath : String -> Request a -> Request a
withBasePath basePath (Request req) =
    Request { req | basePath = basePath }


withTimeout : Float -> Request a -> Request a
withTimeout timeout (Request req) =
    Request { req | timeout = Just timeout }


withTracker : String -> Request a -> Request a
withTracker tracker (Request req) =
    Request { req | tracker = Just tracker }


withHeader : String -> String -> Request a -> Request a
withHeader key value (Request req) =
    Request { req | headers = req.headers ++ [ Http.header key value ] }


withHeaders : List ( String, String ) -> Request a -> Request a
withHeaders headers_ (Request req) =
    Request { req | headers = req.headers ++ headers (List.map (Tuple.mapSecond Just) headers_) }


-- HELPER


headers : List (String, Maybe String) -> List Http.Header
headers =
    List.filterMap (\(key, value) -> Maybe.map (Http.header key) value)


interpolatePath : String -> List ( String, String ) -> List String
interpolatePath rawPath pathParams =
    let
        interpolate =
            (\(name, value) path -> String.replace ("{" ++ name ++ "}") value path)
    in
    List.foldl interpolate rawPath pathParams
        |> String.split "/"
        |> List.drop 1


queries : List (String, Maybe String) -> List Url.Builder.QueryParameter
queries =
    List.filterMap (\(key, value) -> Maybe.map (Url.Builder.string key) value)