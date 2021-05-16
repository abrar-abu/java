package com.abu.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class ArrayDequeTryout {
    public void AllFunctionTryout(){
        //  FIFO approach
        System.out.println("-----------------------------Array Deque-------------------------------------------");
        Deque<String> queue=new ArrayDeque<>();
        // creating priority queue
        queue.add("Amit");
        queue.addLast("last");
        queue.addFirst("first");
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
