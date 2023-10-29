package com.techquestsoft.training.synchronization;

//example of java synchronized method
class Table1{
    synchronized void printTable1(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread11 extends Thread{
    Table1 t;
    MyThread11(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable1(5);
    }

}
class MyThread21 extends Thread{
    Table1 t;
    MyThread21(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable1(100);
    }
}

public class TestSynchronization2{
    public static void main(String args[]){
        Table1 obj = new Table1();//only one object
        MyThread11 t1=new MyThread11(obj);
        MyThread21 t2=new MyThread21(obj);
        t1.start();
        t2.start();
    }
}
