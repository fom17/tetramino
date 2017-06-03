/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetraminos;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author fom_1
 */
public class TetraminoS {

    private String id;

    /**
     * Creates a new instance of TetraminoS
     */
    private TetraminoS(String id) {
        this.id = id;
    }

    /**
     * Get instance of the TetraminoS
     */
    public static TetraminoS getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of TetraminoS class.
        return new TetraminoS(id);
    }

    /**
     * Retrieves representation of an instance of tetraminos.TetraminoS
     * @return an instance of TetraminoS
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public TetraminoS getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of TetraminoS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(TetraminoS content) {
    }

    /**
     * DELETE method for resource TetraminoS
     */
    @DELETE
    public void delete() {
    }
}
