package com.techquestsoft.training.java8newfeatures.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornExample1 {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("js/hello.js"));
    }
}