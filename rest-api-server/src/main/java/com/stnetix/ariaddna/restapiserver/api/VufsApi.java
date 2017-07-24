/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.stnetix.ariaddna.restapiserver.api;

import com.stnetix.ariaddna.restapiserver.model.ErrorModel;
import com.stnetix.ariaddna.restapiserver.model.InitialAllocationModel;
import java.util.UUID;
import com.stnetix.ariaddna.restapiserver.model.Vufs;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-24T10:27:06.657+03:00")

@Api(value = "vufs", description = "the vufs API")
public interface VufsApi {

    @ApiOperation(value = "", notes = "Allows to get difference of previous snapshot and actual.", response = Vufs.class, tags={ "Ariaddna", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Difference VUFS snapshot of current user.", response = Vufs.class),
        @ApiResponse(code = 404, message = "Bad user UUID.", response = ErrorModel.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = ErrorModel.class) })
    
    @RequestMapping(value = "/vufs/snap/diff/{userUuid}/{dateTime}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Vufs> getDiffVUFS(@ApiParam(value = "Current user UUID.",required=true ) @PathVariable("userUuid") UUID userUuid,@ApiParam(value = "FromDateTime of current VUFS snapshot",required=true ) @PathVariable("dateTime") Long dateTime);


    @ApiOperation(value = "", notes = "Allows to get snapshot vufs.", response = Vufs.class, tags={ "Ariaddna", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "VUFS snapshot of current user.", response = Vufs.class),
        @ApiResponse(code = 404, message = "Bad user UUID.", response = ErrorModel.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = ErrorModel.class) })
    
    @RequestMapping(value = "/vufs/snap/{userUuid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Vufs> getVUFS(@ApiParam(value = "Current user UUID.",required=true ) @PathVariable("userUuid") UUID userUuid);


    @ApiOperation(value = "", notes = "Allows to post file allocate strategy from client to server.", response = Vufs.class, tags={ "Ariaddna", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Allocation strategy was send to server. As respose - difference VUFS object.", response = Vufs.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = ErrorModel.class) })
    
    @RequestMapping(value = "/vufs/allocation/{userUuid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Vufs> postAllocateModel(@ApiParam(value = "User UUID.",required=true ) @PathVariable("userUuid") UUID userUuid,@ApiParam(value = "File allocation strategy." ,required=true )  @Valid @RequestBody InitialAllocationModel initialAllocationModel);


    @ApiOperation(value = "", notes = "Allows to send changes in local file storage to server with empty Allocation model and as response get Vufs object with Allocation model.", response = Vufs.class, tags={ "Ariaddna", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Checked snapshot changes.", response = Vufs.class),
        @ApiResponse(code = 409, message = "Changes was not found in clouds.", response = ErrorModel.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = ErrorModel.class) })
    
    @RequestMapping(value = "/vufs/snap/diff/{userUuid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Vufs> sendChangesInLFS(@ApiParam(value = "VUFS snapshot typed object with changed in local file storage with empty Allocation model." ,required=true )  @Valid @RequestBody Vufs localChanges,@ApiParam(value = "Current user UUID.",required=true ) @PathVariable("userUuid") UUID userUuid);

}
