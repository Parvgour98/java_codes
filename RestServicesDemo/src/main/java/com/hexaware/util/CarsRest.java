package com.hexaware.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hexaware.model.Cars;

@Path("/cars")
public class CarsRest {
    /**
     * Retrieve the list from the DB
     * 
     * @return list of cars
     */

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public final Cars[] listAll() {
        final Cars[] carList = Cars.listAll();
        return carList;
    }
}