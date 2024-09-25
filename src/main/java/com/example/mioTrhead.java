package com.example;

public class mioTrhead implements Runnable{
    int l;
    public mioTrhead(int p1){
        l = p1;
     }

    public void run(){
        for(int i = 0;i<l;i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
