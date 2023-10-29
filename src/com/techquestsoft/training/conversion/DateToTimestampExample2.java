package com.techquestsoft.training.conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateToTimestampExample2 {
    public static void main(String args[]){
        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(ts));
    }
}