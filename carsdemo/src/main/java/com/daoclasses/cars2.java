package com.daoclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//using jdbc

class cars2 {
    public static void main(String[] args) {
        // creating a connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarsDemo", "root", "Password123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cars");

            // iterating through the result set
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
            // closing the connection
            con.close();

        } catch (SQLException s) {
            // in this case there is a possibility of an exception being thrown. so a catch
            // is added
            System.out.println(s);

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}