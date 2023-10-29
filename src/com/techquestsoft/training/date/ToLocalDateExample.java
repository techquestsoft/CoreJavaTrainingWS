package com.techquestsoft.training.date;

// important import statement

import java.time.LocalDateTime;
public class ToLocalDateExample
{
    // main method
    public static void main(String[] argvs)
    {
// Getting the instance of LocalDateTime
        LocalDateTime dtm = LocalDateTime.now();
// Getting the LocalDate representation of the LocalDateTime
// using the toLocalDate() method
        System.out.println("The date is: " + dtm.toLocalDate());
    }
}
