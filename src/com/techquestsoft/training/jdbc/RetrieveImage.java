package com.techquestsoft.training.jdbc;

import java.io.FileOutputStream;
import java.sql.*;

public class RetrieveImage {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            PreparedStatement ps = con.prepareStatement("select * from imgtable");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {//now on 1st row

                Blob b = rs.getBlob(2);//2 means 2nd column data
                byte barr[] = b.getBytes(1, (int) b.length());//1 means first image

                FileOutputStream fout = new FileOutputStream("d:\\sonoo.jpg");
                fout.write(barr);

                fout.close();
            }//end of if
            System.out.println("ok");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}