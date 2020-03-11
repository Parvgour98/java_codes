package com.hexaware.util;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @Path("/listAll")
    public final Cars[] listAll() {
        System.out.println("Employees List");
        final Cars[] carList = Cars.listAll();
        return carList;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/addCar")
    public final String addCar(final Cars car) {

        String comment = "";
        // String carname = car.getCarName();
        // double carPrice = car.getPrice();
        // final int result = Cars.insertCar(carname,carPrice);
        final int result = Cars.insertCar(car.getCarName(), car.getPrice());

        if (result > 0) {
            comment = "{\" value\": \"Car added successfully\"}";
        } else {
            comment = "{\" value\": \"Car not added\"}";
        }

        return comment;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updatecar")
    public final String updateCar(final Cars car) {
        String comment = "";

        final int result = Cars.updateCar(car);
        if (result > 0) {
            comment = "{\" value\": \"Car updated successfully\"}";
        } else {
            comment = "{\" value\": \"Update unsuccessful\"}";
        }

        return comment;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public final Cars listCar(@PathParam("id") int id) {
        final Cars car = Cars.find(id);
        return car;
    }
}