package com.techquestsoft.training.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDequeExample2 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        // Adding the element in the front of the deque.
        deque.addFirst("Java");
        System.out.println("The first element is : " + deque);
        // Again adding the element in the front of the deque.
        deque.addFirst("Python");
        System.out.println("After adding the next element in the front of the deque : " + deque);
        deque.add("Ruby");
        System.out.println("The final deque is  : " + deque);
        // Returns the number of elements.
        int size = deque.size();
        System.out.println("The number of elements are : " + size);
        // Removes the last element.
        deque.removeLast();
        System.out.println("Deque after removing the last element is given as :  " + deque);
    }
}
