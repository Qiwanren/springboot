package com.forms.test;

public class ThreadMain {

    public static void main(String[] args){
        System.out.println(" --------- start --------------");

        Thread a = new threadDemo01();
        Thread b = new Thread(new ThreadDemo02());
        a.start();
        b.start();

    }
}
