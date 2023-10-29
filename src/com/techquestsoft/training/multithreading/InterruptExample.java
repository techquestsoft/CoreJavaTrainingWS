package com.techquestsoft.training.multithreading;

// Code illustrating the interrupt() method

// import statement
import java.lang.*;


class ThreadNew131 extends Thread
{
    // constructor of the class
    ThreadNew131(String tName, ThreadGroup tgrp)
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

public class InterruptExample
{
    // main method
    public static void main(String argvs[]) throws SecurityException, InterruptedException
    {
// creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew131 th1 = new ThreadNew131("the first", tg);
        System.out.println("Starting the first");

        ThreadNew131 th2 = new ThreadNew131("the second", tg);
        System.out.println("Starting the second");

// invoking the interrupt method
        tg.interrupt();

    }
}
