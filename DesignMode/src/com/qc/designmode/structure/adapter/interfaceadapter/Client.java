package com.qc.designmode.structure.adapter.interfaceadapter;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */

public class Client {
    public static void main(String[] args){
        new AbsAdapter(){
            @Override
            public void m1() {
                super.m1();
            }
        };
    }
}
