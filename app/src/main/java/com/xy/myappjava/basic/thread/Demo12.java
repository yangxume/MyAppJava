package com.xy.myappjava.basic.thread;

public class Demo12 extends Object{

    private String name;

    public Demo12(String name) {
        this.name = name;
    }

    public void show(){

        for (int i = 0;i<10;i++){
            System.out.println("...x= "+i);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Demo12 finalize()");
    }
}
