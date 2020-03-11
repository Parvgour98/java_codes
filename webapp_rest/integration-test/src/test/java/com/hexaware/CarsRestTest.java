package com.hexaware;

import java.net.URISyntaxException;
import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarsRestTest {

    @Test
    public void getAllCarsTest() throws AssertionError, URISyntaxException {
        Cars[] carList = given().accept(ContentType.JSON).when().get(CommonUtil.getURI("/api/cars")).getBody()
                .as(Cars[].class);
        for (Cars c : carList) {
            switch (c.getId()) {
                case 1:
                    assertEquals(1, c.getId());
                    break;
                default:
                    fail("Unknown Car with id: " + c.getId());
            }
        }
    }

    /**
     * For a single value
     */
    @Test
    public void testCarById() throws AssertionError, URISyntaxException {
        Cars car = given().accept(ContentType.JSON).when().get(CommonUtil.getURI("/api/cars/3")).getBody()
                .as(Cars.class);
        assertEquals(3, car.getId());
        assertEquals("Skoda", car.getCarName());
        assertEquals(9000.00, car.getPrice(), 1.0);
    }

    public void testCarById404() throws AssertionError, URISyntaxException {
        given().accept(ContentType.JSON).when().get(CommonUtil.getURI("/api/cars/3")).then().assertThat()
                .statusCode(404);
    }
}