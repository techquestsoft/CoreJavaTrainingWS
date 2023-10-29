package com.techquestsoft.training.synchronization;

class Table3
{
    void printTable3(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class MyThread3 extends Thread{
    Table3 t;
    MyThread3(Table3 t){
        this.t=t;
    }
    public void run(){
        t.printTable3(5);
    }

}
class MyThread4 extends Thread{
    Table3 t;
    MyThread4(Table3 t){
        this.t=t;
    }
    public void run(){
        t.printTable3(100);
    }
}

public class TestSynchronizedBlock1{
    public static void main(String args[]){
        Table3 obj = new Table3();//only one object
        MyThread3 t1=new MyThread3(obj);
        MyThread4 t2=new MyThread4(obj);
        t1.start();
        t2.start();
    }
}
