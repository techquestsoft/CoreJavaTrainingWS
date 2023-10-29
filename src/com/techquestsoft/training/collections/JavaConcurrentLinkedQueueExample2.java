package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JavaConcurrentLinkedQueueExample2 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        queue.add(11);
        queue.add(100);
        queue.add(122);
        queue.add(102);
        queue.add(112);
        list.add(11);
        list.add(100);
        System.out.println("Elements in queue : " + queue);
        //remove() method will remove the specified element from the queue
        queue.remove(122);
        queue.remove(102);
        System.out.println("Remaining elements in queue : " + queue);
        //Removes all the elements of this in queue which are present in the list
        queue.removeAll(list);
        System.out.println("Elemts of the list will get removed : " + queue);
        //Retain only those elements in this queue that are present in the list
        queue.retainAll(list);
        System.out.println("Queue will retain the elements of the list: " + queue);
    }
}
