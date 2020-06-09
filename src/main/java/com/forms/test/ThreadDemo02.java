package com.forms.test;

public class ThreadDemo02 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Runnerable Thread :" + Thread.currentThread().getName() + "  " + i);
        }
    }
}
