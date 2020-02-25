package com.daoclasses;

import java.util.List;

class cars {
    private String carName;
    private double price;

    public cars() {

    }

    public cars(String name, double price) {
        this.carName = name;
        this.price = price;
    }

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

    private static CarsDao1 dao(){
        DBconnection db = new DBconnection();
        return db.getConnect().onDemand(CarsDao1.class);
    } 

    public static cars[] listAll(){
        List<cars> list = dao().listAll();
        return list.toArray(new cars[list.size()]);
    }

    public static void insertCar(String carname, double price){
        dao().insertCar(carname, price);
    }

    public static void deleteCar(double price){
        dao().deleteCar(price);
    }

}