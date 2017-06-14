package io.swagger.api;

import io.swagger.model.GenericError;
import io.swagger.model.InventoryItem;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/inventory")

@Api(description = "the inventory API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-06-14T18:35:23.452Z")

public class InventoryApi  {

    @POST
    
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "Adds a new item to the inventory", notes = "Duplicate SKUs will be rejected", response = void.class, tags={ "Inventory",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Item created", response = void.class),
        @ApiResponse(code = 400, message = "General Error", response = void.class) })
    public Response addInventory(InventoryItem inventory) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{sku}")
    
    
    @ApiOperation(value = "Deletes an item by its SKU", notes = "", response = void.class, tags={ "Inventory",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item successfully deleted", response = void.class) })
    public Response deleteItemBySKU(@PathParam("sku") String sku) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns inventory from the system", notes = "longer description", response = InventoryItem.class, responseContainer = "List", tags={ "Inventory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the inventory for the query", response = InventoryItem.class, responseContainer = "List") })
    public Response getInventory(@QueryParam("skip") Integer skip) {
    	return Response.ok().entity("magic!").build();
    }
}

