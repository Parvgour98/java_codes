package com.model;

import java.util.List;
import java.util.Objects;

import com.persistence.CarsDAO;
import com.persistence.DBConnection;

public class Cars {
    private String carName;
    private double price;

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

    /**
     * the dao for Cars
     */

    private static CarsDAO dao() {
        DBConnection db = new DBConnection();
        return db.getConnection().onDemand(CarsDAO.class);
    }

    /**
     * list all cars
     * 
     * @return array of cars
     */

    public static Cars[] listAll() {
        List<Cars> list = dao().listAll();
        return list.toArray(new Cars[list.size()]);
    }

    /**
     * insert a car
     * 
     * @param carname
     * @param price
     */
    public static void insertCar(String carname, double price) {
        dao().insertCar(carname, price);
    }

    /**
     * list car details by carname
     * 
     * @param carName
     * @return Cars
     */
    public static Cars find(String carName) {
        return dao().find(carName);
    }
}