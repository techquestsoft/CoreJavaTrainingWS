package com.techquestsoft.training.java8newfeatures.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornExample4 {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("js/hello.js"));
        Invocable invocable = (Invocable) ee;
        // calling a function
        invocable.invokeFunction("functionDemo1");
        // calling a function and passing variable as well.
        invocable.invokeFunction("functionDemo2", "Nashorn");
    }
}
