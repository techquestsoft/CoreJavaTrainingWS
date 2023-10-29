package com.techquestsoft.training.features4and5;

import java.util.ArrayList;

class TestAnnotation2 {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");

        for (Object obj : list)
            System.out.println(obj);

    }
}
