package com.techquestsoft.training.Reflection;

import static java.lang.System.out;
import java.lang.reflect.*;
import javax.swing.*;

class Simple5{
    void message(){System.out.println("Hello Java");}
}

class Test5{
    public static void main(String argvs[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try{
            Class c=Class.forName("com.training.Reflection.Simple5");
            Simple5 s=(Simple5)c.newInstance();
            s.message();

        }catch(Exception e){System.out.println(e);}

    }
}
