/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
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
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Default", description = "the Default API")
public interface DefaultApi {

    /**
     * GET /thingy/{date}
     *
     * @param date A date path parameter (required)
     * @param dateTime A date-time query parameter (required)
     * @param xOrderDate A date header parameter (required)
     * @param loginDate A date cookie parameter (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "get",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/thingy/{date}"
    )
    ResponseEntity<Void> get(
        @Parameter(name = "date", description = "A date path parameter", required = true, schema = @Schema(description = "")) @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  date,
        @NotNull @Parameter(name = "dateTime", description = "A date-time query parameter", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "dateTime", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)  dateTime,
        @Parameter(name = "X-Order-Date", description = "A date header parameter", required = true, schema = @Schema(description = "")) @RequestHeader(value = "X-Order-Date", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  xOrderDate,
        @Parameter(name = "loginDate", description = "A date cookie parameter", schema = @Schema(description = "")) @CookieValue("loginDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  loginDate
    );


    /**
     * POST /thingy/{date}
     * update with form data
     *
     * @param date A date path parameter (required)
     * @param visitDate Updated last vist timestamp (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updatePetWithForm",
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/thingy/{date}",
        consumes = "application/x-www-form-urlencoded"
    )
    ResponseEntity<Void> updatePetWithForm(
        @Parameter(name = "date", description = "A date path parameter", required = true, schema = @Schema(description = "")) @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  date,
        @Parameter(name = "visitDate", description = "Updated last vist timestamp", schema = @Schema(description = "")) @RequestParam(value="visitDate", required=false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime visitDate
    );

}
