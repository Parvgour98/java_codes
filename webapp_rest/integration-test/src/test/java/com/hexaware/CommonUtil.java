package com.hexaware;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

//system.host
//system.port
//system.webapp
//root uri = /api/

public class CommonUtil {

    // declarations
    public static final String host;
    public static final String port;
    public static final String webapp;
    public static final String prefix_uri;

    static {
        host = System.getProperty("service.host", "localhost");
        port = System.getProperty("service.port", "8080");
        webapp = System.getProperty("service.webapp", "RestServicesDemo");
        prefix_uri = "http://" + host + ":" + port + "/" + webapp;
    }

    public static URI getURI(String path) throws URISyntaxException {
        return new URI(prefix_uri + path);
    }
}

class Cars {
    private String carName;
    private double price;
    private int id;

    // default constructor
    public Cars() {
    }

    // parameterized constructor
    public Cars(String carName, double price) {
        this.carName = carName;
        this.price = price;
    }

    /**
     * Setter and Getters
     * 
     */
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return carName + " " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cars car = (Cars) obj;
        if (Objects.equals(carName, car.carName) && Objects.equals(price, car.price)) {
            return true;
        }
        return false;
    }
}
