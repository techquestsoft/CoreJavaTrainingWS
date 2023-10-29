package com.techquestsoft.training.java8newfeatures.java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample13 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> pricesList = productsList.stream()
                .filter(p -> p.price > 30000)   // filtering price
                .map(pm -> pm.price)          // fetching price
                .collect(Collectors.toList());
        System.out.println(pricesList);
    }
}
