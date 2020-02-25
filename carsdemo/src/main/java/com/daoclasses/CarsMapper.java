package com.daoclasses;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CarsMapper implements ResultSetMapper<cars> {

    @Override
    public final cars map(final int index, final ResultSet r, final StatementContext ctx) throws SQLException {
        return new cars(r.getString("name"), r.getDouble("price"));
    }

}