package com.techquestsoft.training.multithreading;

public class TestSleepMethod2
{
    // main method
    public static void main(String argvs[])
    {

        try {
            for (int j = 0; j < 5; j++)
            {

// The main thread sleeps for the 1000 milliseconds, which is 1 sec
// whenever the loop runs
                Thread.sleep(1000);

// displaying the value of the variable
                System.out.println(j);
            }
        }
        catch (Exception expn)
        {
// catching the exception
            System.out.println(expn);
        }
    }
}
