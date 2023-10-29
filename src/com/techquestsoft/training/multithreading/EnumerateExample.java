package com.techquestsoft.training.multithreading;

// Code illustrating the enumerate() method

// import statement
import java.lang.*;


class ThreadNew21 extends Thread
{
    // constructor of the class
    ThreadNew21(String tName, ThreadGroup tgrp)
    {
        super(tgrp, tName);
        start();
    }

    // overriding the run() method
    public void run()
    {

        for (int j = 0; j < 100; j++)
        {
            try
            {
                Thread.sleep(5);
            }
            catch (InterruptedException e)
            {
                System.out.println("The exception has been encountered " + e);
            }

        }

        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

public class EnumerateExample
{
    // main method
    public static void main(String argvs[]) throws SecurityException, InterruptedException
    {
// creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew21 th1 = new ThreadNew21("the first", tg);
        System.out.println("Starting the first");

        ThreadNew21 th2 = new ThreadNew21("the second", tg);
        System.out.println("Starting the second");

// returning the number of threads kept in this array
        Thread[] grp = new Thread[tg.activeCount()];
        int cnt = tg.enumerate(grp);
        for (int j = 0; j < cnt; j++)
        {
            System.out.println("Thread " + grp[j].getName() + " is found.");
        }
    }
}
