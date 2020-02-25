package com.daoclasses;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.*;

import com.daoclasses.*;

public interface CarsDao1 {

    // insert into table
    @SqlUpdate("insert into cars(name, price) values(:name, :price)")
    void insertCar(@Bind("name") String name, @Bind("price") double Price);

    @SqlQuery("select * from cars")
    @Mapper(CarsMapper.class)
    List<cars> list();

    @SqlQuery("select * from cars where price > :price")
    @Mapper(CarsMapper.class)
    List<cars> listCarsOnPrice(@Bind("price") double price);

    @SqlUpdate("Delete from cars where price = :price")
    void deleteCar(@Bind("price") double price);

    @SqlUpdate("update cars set price = :price where name = :name")
    void updateCars(@Bind("name")String name, @Bind("price")double price);

    @SqlQuery("select * from cars where name = :name")
    cars find(@Bind("name")String name);

}