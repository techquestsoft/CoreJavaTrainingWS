package com.techquestsoft.training.Reflection;

class Simple4{}
interface My{}

class Test4{
    public static void main(String args[]){
        try{
            Class c=Class.forName("com.training.Reflection.Simple4");
            System.out.println(c.isInterface());

            Class c2=Class.forName("com.training.Reflection.My");
            System.out.println(c2.isInterface());

        }catch(Exception e){System.out.println(e);}

    }
}
