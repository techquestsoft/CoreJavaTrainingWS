package com.techquestsoft.training.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrievePrepared {

    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            PreparedStatement stmt = con.prepareStatement("select * from emp");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
