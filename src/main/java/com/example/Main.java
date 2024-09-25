package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 200;

        mioTrhead t1 = new mioTrhead(l);//creazione thread
        mioTrhead t2 = new mioTrhead(l);//creazione thread
        new Thread(t1).start(); 
        new Thread(t2).start();;

       System.out.println("hello world");
    }
}