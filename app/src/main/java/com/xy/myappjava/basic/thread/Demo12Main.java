package com.xy.myappjava.basic.thread;

public class Demo12Main {

    public static void main(String [] args){

        new Demo12();

        new Demo12();

        System.gc();

        new Demo12();

        System.out.println("Hello Demo12Main");

    }

}
