package com.techquestsoft.training.date;

import java.util.TimeZone;
public class TimeZoneExample1 {
    public static void main( String args[] ){
        String[] id = TimeZone.getAvailableIDs();
        System.out.println("In TimeZone class available Ids are: ");
        for (int i=0; i<id.length; i++){
            System.out.println(id[i]);
        }
    }
}
