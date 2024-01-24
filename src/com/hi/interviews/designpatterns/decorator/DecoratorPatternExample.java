package com.hi.interviews.designpatterns.decorator;


/**
 *  the decorator design pattern is a structural pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. Here's an example of the decorator pattern in Java, where we'll create a simple coffee ordering system:
 *
 * In this example, Coffee is the component interface representing a basic coffee. SimpleCoffee is the concrete component class implementing the basic coffee. CoffeeDecorator is the abstract decorator class that extends Coffee and has a reference to a Coffee object. Concrete decorator classes (MilkDecorator and SugarDecorator) extend CoffeeDecorator and add specific behavior (milk or sugar) to the coffee.
 *
 * The DecoratorPatternExample class demonstrates how to use the decorator pattern to create various combinations of coffee orders. The output will show the cost and description of each order.
 */
public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Ordering a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        // Decorating with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());

        // Decorating with sugar
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost: " + sugarCoffee.getCost() + ", Description: " + sugarCoffee.getDescription());

        // Decorating with milk and sugar
        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost: " + milkSugarCoffee.getCost() + ", Description: " + milkSugarCoffee.getDescription());
    }
}
