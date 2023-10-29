package com.techquestsoft.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class FetchRecordsBatch {
    public static void main(String args[]) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
        con.setAutoCommit(false);

        Statement stmt = con.createStatement();
        stmt.addBatch("insert into user420 values(190,'abhi',40000)");
        stmt.addBatch("insert into user420 values(191,'umesh',50000)");

        stmt.executeBatch();//executing the batch

        con.commit();
        con.close();
    }
}