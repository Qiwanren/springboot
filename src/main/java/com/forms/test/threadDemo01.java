package com.forms.test;

public class threadDemo01 extends Thread{

    public void run(){
       for (int i=0;i<10;i++){
           System.out.println(" Thread :" + Thread.currentThread().getName() + "  " + i);
       }
    }

}
