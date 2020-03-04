package com.hexaware.persistence;

import java.util.List;

import com.hexaware.model.*;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface CarsDAO {

    @SqlUpdate("Insert into Cars (name,price) values(:name, :price")
    public int insertCar(@Bind("name") String carName, @Bind("price") double price);

    @SqlQuery("Select * from Cars")
    @Mapper(CarsMapper.class)
    public List<Cars> listAll();

    @SqlQuery("Select * from Cars where id = :id")
    @Mapper(CarsMapper.class)
    Cars find(@Bind("id") int id);

    @SqlUpdate("update Cars set price = :price where id = :id")
    int updateCar(@Bind("price") double price, @Bind("id") int id);

}