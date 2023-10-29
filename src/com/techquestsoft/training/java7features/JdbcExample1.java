package com.techquestsoft.training.java7features;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JdbcExample1 {
    public static void main(String args[]) throws Exception {
        try (// --------------try-with-resources begin-------------//
             // Creating connection
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "mysql");
             // Creating statement
             Statement stmt = con.createStatement();
             // Executing query
             ResultSet rs = stmt.executeQuery("select * from user");
        )// --------------try-with-resources end--------------//
        { // ----------------try block begin---------------------//
            // Creating CachedRowSet
            CachedRowSet cRS = RowSetProvider.newFactory().createCachedRowSet();
            // Populating ResultSet data into CachedRowSet
            cRS.populate(rs);
            while (cRS.next()) {
                System.out.println(cRS.getInt(1) + "" + cRS.getString(2) + "" + cRS.getString(3));
            }
        } // ----------------try block end----------------------//
        catch (Exception e) { // Exception handler
            System.out.println(e);
        }
    }
}
