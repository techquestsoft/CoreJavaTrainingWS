package com.techquestsoft.training.multithreading;

// Code illustrating the getParent() method

// import statement
import java.lang.*;


class ThreadNew12111 extends Thread
{
    // constructor of the class
    ThreadNew12111(String tName, ThreadGroup tgrp)
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
                System.out.println("The exception has been encountered" + e);
            }

        }

        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

public class GetParentExample
{
    // main method
    public static void main(String argvs[]) throws SecurityException, InterruptedException
    {
// creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew12111 th1 = new ThreadNew12111("the first", tg);
        System.out.println("Starting the first");

        ThreadNew12111 th2 = new ThreadNew12111("the second", tg);
        System.out.println("Starting the second");

// printing the parent ThreadGroup
// of both child and parent threads
        System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());
        System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());


    }
}  
