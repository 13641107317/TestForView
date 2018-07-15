package com.example.wp.testforview;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by WangPeng on 2018/6/28.
 */
public class MyBlockQueue<E> {
   List list;
   int limit;

    public MyBlockQueue(int limit) {
        this.limit = limit;
        list = new LinkedList();
    }
    public void put(E e){
        while (true){
            synchronized (list){
                if (list.size()<limit){
                    list.add(e);
                    return;
                }
            }
        }
    }
    public E take(){
        while (true){
            synchronized (this){
                if (list.size()>0){
                    E remove = (E) list.remove(0);
                    return remove;
                }
            }
        }
    }



}
