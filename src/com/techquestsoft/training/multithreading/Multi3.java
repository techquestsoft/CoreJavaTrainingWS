package com.techquestsoft.training.multithreading;

class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}