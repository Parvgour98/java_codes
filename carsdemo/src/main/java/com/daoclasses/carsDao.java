package com.daoclasses;

//import java.sql.SQLException;
import java.util.*;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;

//to retrieve all the cars from the table

class carsDao {
    public static void main(String[] args) {
        // used to handle the connection
        Handle handle = null;

        // creats a link to the MySQL database
        DBI dbi = new DBI("jdbc:mysql://localhost:3306/CarsDemo", "root", "Password123");

        // sql statement
        String sql = "SELECT * FROM Cars";

        try {
            handle = dbi.open();
            Query<Map<String, Object>> q = handle.createQuery(sql);
            List<Map<String, Object>> l = q.list();

            for (Map<String, Object> m : l) {

                System.out.printf("%d ", m.get("Id"));
                System.out.printf("%s ", m.get("Name"));
                System.out.println(m.get("Price"));
            }
            // catch is unreachable in this code as there is no exception being thrown.
        } finally {
            if (handle != null) {
                handle.close();
            }
        }
    }
}