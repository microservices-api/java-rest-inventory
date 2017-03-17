package io.swagger.api;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.InventoryItem;

@Path("/inventory")

@Api(description = "the inventory API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-03-16T20:25:23.755Z")

public class InventoryApi  {

	private static Map<String,InventoryItem> inventoryMap = new HashMap<String,InventoryItem>();
	
    @POST
    @Consumes({ "application/json" })
    @ApiOperation(value = "Adds a new item to the inventory", notes = "Duplicate SKUs will be rejected", response = void.class, tags={ "Inventory",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Item created", response = void.class),
        @ApiResponse(code = 400, message = "General Error", response = void.class) })
    public Response addInventory(InventoryItem inventory) {
    	inventoryMap.put(inventory.getSku(), inventory);
    	return Response.status(201).build();
    }

    @DELETE
    @Path("/{sku}")
    
    
    @ApiOperation(value = "Deletes an item by its SKU", notes = "", response = void.class, tags={ "Inventory",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item successfully deleted", response = void.class) })
    public Response deleteItemBySKU(@PathParam("sku") String sku) {
    	inventoryMap.remove(sku);
    	return Response.status(200).build();
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns inventory from the system", notes = "longer description", response = InventoryItem.class, responseContainer = "List", tags={ "Inventory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the inventory for the query", response = InventoryItem.class, responseContainer = "List") })
    public Response getInventory(@QueryParam("skip") Integer skip) {
    	return Response.ok(inventoryMap.values()).build();
    }
}

