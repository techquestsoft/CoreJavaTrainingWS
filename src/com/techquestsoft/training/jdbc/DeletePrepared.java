package com.techquestsoft.training.jdbc;

import java.sql.PreparedStatement;

public class DeletePrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            PreparedStatement stmt = con.prepareStatement("delete from emp where id=?");
            stmt.setInt(1, 101);

            int i = stmt.executeUpdate();
            System.out.println(i + " records deleted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
