package com.abu.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTryout {
    public void AllFunctionTryout(){
        //  FIFO approach
        System.out.println("-----------------------------Priority Queue-------------------------------------------");
        Queue<String> queue=new PriorityQueue<>();
        // creating priority queue
        queue.add("Amit");
        // adding elements
        queue.add("Rachit");
        queue.add("Rahul");
        queue.add("Rahim");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        System.out.println("iterating the queue elements: after remove");
        itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.poll();
        System.out.println("iterating the queue elements: after poll");
        itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
