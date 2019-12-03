package com.qc.designmode.behavior.iterator;

import java.util.ArrayList;

/**
 * @author qc
 * @date 2019/12/3
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Client {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new ArrayList<>());
        myArrayList.AddObject(1);
        myArrayList.AddObject(2);
        AbstractIterator iterator = myArrayList.createIterator();
        Object next = iterator.getNext();
        iterator.next();
        Object next2 = iterator.getNext();
        System.out.println(next+"  -  "+next2);
    }
}
