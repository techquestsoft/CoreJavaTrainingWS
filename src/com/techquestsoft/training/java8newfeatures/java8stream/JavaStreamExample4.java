package com.techquestsoft.training.java8newfeatures.java8stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample4 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // This is more compact approach for filtering data
        List<Product> productsList1 = productsList.stream()
                .filter(product -> product.price == 30000)
                .collect(java.util.stream.Collectors.toList());
        for (Product p:productsList1) {
            System.out.println(p.price);

        }
    }
}