package com.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * unit test class for Cars
 */
public class CarsTest {

    Cars c;

    @Before
    public void initInput() {
        c = new Cars();
    }

    @After
    public void destroyObject() {
        c = null;
    }

    /**
     * test for default constructor
     */
    @Test
    public void testCarsDefault() {
        Cars newcar = new Cars();
        assertNotEquals("hashcode", newcar.hashCode(), new Cars().hashCode());

        // newcar.setCarName("i20");
        // assertNotEquals("Skoda", newcar.getCarName());
    }

    /**
     * test for parameterized constructor
     */
    @Test
    public void testCars() {
        Cars car = new Cars("Skoda", 450000);
        assertEquals(450000, car.getPrice(), 1);
    }

    @Test
    public void testCarsSetters() {
        c = new Cars();
        c.setCarName("i10");
        c.setPrice(350000);

        assertEquals("i10", c.getCarName());

    }
}