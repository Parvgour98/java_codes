package com.hexaware.util;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.hasItems;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;

import org.hamcrest.Matchers;

public class CarsRestTest {
    String port = System.getProperty("server.port");

    @BeforeClass
    public void setup() {

        if (port == null) {
            RestAssured.port = Integer.valueOf(8080);
        } else {
            RestAssured.port = Integer.valueOf(port);
        }
    }

    final String ROOT_URI = "http://localhost:" + port + "/RestServicesDemo/api/cars";

    /**
     * @GET test
     */
    @Test
    public void get_test() {
        Response response = given().when().get(ROOT_URI + "/listAll");
        System.out.println(response.asString());

        response.then().body("id", hasItems(0));
        response.then().body("carname", hasItems("Audi"));
        response.then().body("price", hasItems(52642.0));
    }

    @Test
    public void get_based_on_value(int id) {
        Response response = given().when().get(ROOT_URI + id);
        response.then().body("carname", Matchers.is("Audi"));
    }

}
