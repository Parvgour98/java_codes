package com.daoclasses;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface CarsDao1 {

    // insert into table
    @SqlUpdate("insert into cars(name, price) values(:name, :price)")
    void insertCar(@Bind("name") String name, @Bind("price") double Price);

    @SqlQuery("select * from cars")
    @Mapper(CarsMapper.class)
    List<cars> listAllCars();

    @SqlQuery("select * from cars > :price")
    @Mapper(CarsMapper.class)
    void listCarsOnPrice(@Bind("price") double price);

    @SqlUpdate("Delete from cars where price > :price")
    void deleteCar(@Bind("price") double price);

}