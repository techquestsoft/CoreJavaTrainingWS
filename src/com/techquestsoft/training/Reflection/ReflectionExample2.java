package com.techquestsoft.training.Reflection;

// important import statements
import static java.lang.System.out;
import java.lang.reflect.*;
import javax.swing.*;

public class ReflectionExample2
{
    // main method
    public static void main(String argvs[])
    {
        try
        {
            Class[] t = { String.class };
            Class classDef = Class.forName("javax.swing.JLabel");

// getting the constructor
            Constructor cons = classDef.getConstructor(t);

// setting the label
            Object[] objct = { "My JLabel in Reflection."};

// getting the instance by invoking the correct constructor this time
            Object ob = cons.newInstance(objct);


// instance variable for holding the instance of the class
            JLabel l1;

// checking whether the created object ob is
// the instance of JLabel or not.
// If yes, do the typecasting; otherwise, exit from the method
            if(ob instanceof JLabel)
            {
                l1 = (JLabel)ob;
            }
            else
            {
// exiting from the method using the return statement
                return;
            }

// if the control reaches here, then it means the typecasting has been done
// now we can print the label of the JLabel instance
            out.println(l1.getText());
        }
// relevant catch block for handling the raised exceptions.
        catch (InstantiationException ie)
        {
            out.println(ie);
        }
        catch (IllegalAccessException ie)
        {
            System.out.println(ie);
        }

        catch (InvocationTargetException ie)
        {
            out.println(ie);
        }
        catch (ClassNotFoundException e)
        {
            out.println(e);
        }

        catch (NoSuchMethodException e)
        {
            out.println(e);
        }
    }
}
