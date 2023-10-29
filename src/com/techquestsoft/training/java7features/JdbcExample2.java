package com.techquestsoft.training.java7features;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

class JdbcExample2 {
    public static void main(String args[]) throws Exception {
        try (// --------------try-with-resources begin-------------//
             // Creating connection
             JdbcRowSet jRS = RowSetProvider.newFactory().createJdbcRowSet();
        )// --------------try-with-resources end--------------//
        { // ----------------try block begin---------------------//
            // Set database connection
            jRS.setUrl("jdbc:mysql://localhost:3306/student");
            // Set database username
            jRS.setUsername("root");
            // Set database password
            jRS.setPassword("mysql");
            // Set sql query to execute
            jRS.setCommand("select * from user");
            // Execute query
            jRS.execute();
            while (jRS.next()) {
                System.out.println(jRS.getInt(1) + "" + jRS.getString(2) + "" + jRS.getString(3));
            }
        } // ----------------try block end----------------------//
        catch (Exception e) { // Exception handler
            System.out.println(e);
        }
    }
}
