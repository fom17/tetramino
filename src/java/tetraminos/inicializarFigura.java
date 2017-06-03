/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetraminos;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author fom_1
 */
@Path("/Items")
public class inicializarFigura {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of inicializarFigura
     */
    public inicializarFigura() {
    }

    /**
     * Retrieves representation of an instance of tetraminos.inicializarFigura
     * @return an instance of TetraminoS
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public TetraminoS getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * POST method for creating an instance of TetraminoS
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response postXml(TetraminoS content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for {id}
     */
    @Path("{id}")
    public TetraminoS getTetraminoS(@PathParam("id") String id) {
        return TetraminoS.getInstance(id);
    }
}
