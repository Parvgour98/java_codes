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
    public final Cars[] listAll() {
        final Cars[] carList = Cars.listAll();
        return carList;
    }
  
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/addCar")
    public final String addCar(final Cars car) 
    {
        String comment = "";
        final int result = Cars.insertCar(car.getCarName(), car.getPrice());
        if(result > 0){
          comment = "{\" value \" : \" Car added successfully \"}";
        }else{
          comment = "{\" value \" : \" Car not added  \"}";
        }
        return comment;
    }
  
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updateCar")
    public final String updateCar(final Cars car) 
    {
        String comment = "";
        final int result = Cars.updateCar(car);
        if(result > 0){
          comment = "{\" value \" : \" Car updated successfully \"}";
        }else{
          comment = "{\" value \" : \" Car not updated  \"}";
        }
        return comment;
    }
  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/showCar/{id}")
    public final Cars showCar(@PathParam("id") final int carId) {
      final Cars car = Cars.find(carId);
      return car;
    }


}