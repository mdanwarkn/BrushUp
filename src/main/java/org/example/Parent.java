package org.example;

public class Parent implements Comparable{


    public void action(){
        System.out.println("Parent action 1");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}