package com.techquestsoft.training.jdbc;

import java.sql.PreparedStatement;

public class UpdatePrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            PreparedStatement stmt = con.prepareStatement("update emp set name=? where id=?");
            stmt.setString(1, "Sonoo");//1 specifies the first parameter in the query i.e. name
            stmt.setInt(2, 101);

            int i = stmt.executeUpdate();
            System.out.println(i + " records updated");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
