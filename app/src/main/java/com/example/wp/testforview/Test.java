package com.example.wp.testforview;

/**
 * Created by wangpeng .
 */
public class Test {
    Object object = new Object();
    String value = "";
    public synchronized void test1(){
        value = "A";
        System.out.print(value);
    }
    public void test2(){
        synchronized (object){
            value = "B";
            System.out.print(value);
        }
    }
}
