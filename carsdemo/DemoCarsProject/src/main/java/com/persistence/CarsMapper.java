package com.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Cars;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CarsMapper implements ResultSetMapper<Cars> {

    @Override
    public final Cars map(final int index, final ResultSet r, final StatementContext ctx) throws SQLException {
        return new Cars(r.getString("name"), r.getDouble("price"));
    }

}