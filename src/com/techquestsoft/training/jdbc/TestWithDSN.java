package com.techquestsoft.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Test {
    public static void main(String ar[]) {
        try {
            String url = "jdbc:odbc:mydsn";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c = DriverManager.getConnection(url);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from login");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }

    }
}
