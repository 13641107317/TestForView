package com.example.wp.testforview;

import org.junit.Test;

/**
 * Created by wangpeng .
 */
public class StackDemo {
    boolean flag = false;

    @Test
    public void demo() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    sub();
                }
            }
        }).start();
        for (int i = 0; i < 50; i++) {
            main();
        }
    }

    private synchronized void sub() {

        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("sub" + i);
        }
        flag = true;
        notify();
    }
    private synchronized void main(){
        while (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
        flag = false;
        notify();

    }
}
