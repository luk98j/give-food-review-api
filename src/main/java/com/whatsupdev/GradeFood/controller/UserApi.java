/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.whatsupdev.GradeFood.controller;

import com.whatsupdev.GradeFood.model.Error;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-09T23:00:03.137099500+02:00[Europe/Warsaw]")
@Validated
@Tag(name = "user", description = "the user API")
public interface UserApi {

    /**
     * PUT /user/forgotten/change : Final action to reset password
     *
     * @param body Body of change forgotten object (optional)
     * @return Password correctly reset (status code 200)
     *         or User not found (status code 404)
     *         or Unexpected error (status code 500)
     */
    @Operation(
        operationId = "userForgottenChangePut",
        summary = "Final action to reset password",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Password correctly reset", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/forgotten/change",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<Object> userForgottenChangePut(
        @Parameter(name = "body", description = "Body of change forgotten object") @Valid @RequestBody(required = false) Object body
    );


    /**
     * PUT /user/forgotten : Action to reset password/send mail of login
     *
     * @param body Body of forgotten object (optional)
     * @return Action for reseting password (status code 201)
     *         or User not found (status code 404)
     *         or Unexpected error (status code 500)
     */
    @Operation(
        operationId = "userForgottenPut",
        summary = "Action to reset password/send mail of login",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Action for reseting password", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/forgotten",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<Object> userForgottenPut(
        @Parameter(name = "body", description = "Body of forgotten object") @Valid @RequestBody(required = false) Object body
    );


    /**
     * PUT /user/user-update : Update of user data
     *
     * @param body Body of update object (optional)
     * @return User correctly updated (status code 200)
     *         or User data was wrong (status code 400)
     *         or User not authorized (status code 403)
     *         or User not found (status code 404)
     *         or Unexpected error (status code 500)
     */
    @Operation(
        operationId = "userUserUpdatePut",
        summary = "Update of user data",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User correctly updated", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "400", description = "User data was wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "User not authorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/user-update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<Object> userUserUpdatePut(
        @Parameter(name = "body", description = "Body of update object") @Valid @RequestBody(required = false) Object body
    );

}
