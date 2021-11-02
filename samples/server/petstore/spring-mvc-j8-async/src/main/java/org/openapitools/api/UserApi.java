/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import org.openapitools.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     */

    @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user"
    )
    default CompletableFuture<ResponseEntity<Void>> createUser(

@ApiParam(value = "Created user object", required = true )   @Valid  @RequestBody User body) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    /**
     * POST /user/createWithArray : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */

    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithArrayInput", notes = "", tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithArray"
    )
    default CompletableFuture<ResponseEntity<Void>> createUsersWithArrayInput(

@ApiParam(value = "List of user object", required = true )   @Valid  @RequestBody List<User> body) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    /**
     * POST /user/createWithList : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */

    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithListInput", notes = "", tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithList"
    )
    default CompletableFuture<ResponseEntity<Void>> createUsersWithListInput(

@ApiParam(value = "List of user object", required = true )   @Valid  @RequestBody List<User> body) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */

    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 400, message = "Invalid username supplied"),

        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    default CompletableFuture<ResponseEntity<Void>> deleteUser(@ApiParam(value = "The name that needs to be deleted", required = true) @PathVariable("username") String username

) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    /**
     * GET /user/{username} : Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */

    @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = User.class),

        @ApiResponse(code = 400, message = "Invalid username supplied"),

        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/xml", "application/json" }
    )
    default CompletableFuture<ResponseEntity<User>> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.", required = true) @PathVariable("username") String username

) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                        String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>123</userStatus> </User>";
                        ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }


    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */

    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = String.class),

        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/xml", "application/json" }
    )
    default CompletableFuture<ResponseEntity<String>> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username

,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password

) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */

    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    default CompletableFuture<ResponseEntity<Void>> logoutUser() {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }


    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param body Updated user object (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */

    @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 

        @ApiResponse(code = 400, message = "Invalid user supplied"),

        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}"
    )
    default CompletableFuture<ResponseEntity<Void>> updateUser(@ApiParam(value = "name that need to be deleted", required = true) @PathVariable("username") String username

,

@ApiParam(value = "Updated user object", required = true )   @Valid  @RequestBody User body) {
        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }

}
