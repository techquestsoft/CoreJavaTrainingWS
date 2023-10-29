package com.techquestsoft.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class InsertPrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?)");
            stmt.setInt(1, 101);//1 specifies the first parameter in the query
            stmt.setString(2, "Ratan");

            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
