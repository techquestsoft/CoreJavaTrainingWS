package com.techquestsoft.training.java8newfeatures.nashorn;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornExample3 {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        //Binding script and Define scope of script
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("name", "Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("js/hello.js"));
    }
}
