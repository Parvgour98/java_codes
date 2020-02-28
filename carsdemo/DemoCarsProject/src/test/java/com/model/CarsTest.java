package com.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import com.persistence.CarsDAO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;

/**
 * unit test class for Cars
 */

@RunWith(JMockit.class)
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

    @Test
    public void testListAllEmpty(@Mocked final CarsDAO dao) {
        new Expectations() {
            {
                dao.listAll();
                result = new ArrayList<Cars>();
            }
        };
        new MockUp<Cars>() {
            @Mock
            CarsDAO dao() {
                return dao;
            }
        };
        Cars[] es = Cars.listAll();
        assertEquals(0, es.length);

    }

    @Test
    public void testListAllSome(@Mocked final CarsDAO dao) {
        new Expectations() {
            {
                // declaring an arraylist
                ArrayList<Cars> es = new ArrayList<Cars>();
                es.add(new Cars("Datsun", 1200000));
                es.add(new Cars("Tata Nano", 200000));
                es.add(new Cars("Rolls Royce", 70000000));
                dao.listAll();
                result = es;
            }
        };
        new MockUp<Cars>() {
            @Mock
            CarsDAO dao() {
                return dao;
            }
        };

        Cars[] es = Cars.listAll();
        assertEquals(3, es.length);
        assertEquals(new Cars("Datsun", 1200000), es[0]);

    }
}