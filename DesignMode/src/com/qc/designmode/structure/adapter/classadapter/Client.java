package com.qc.designmode.structure.adapter.classadapter;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */

public class Client {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.charging(new Adapter());
    }
}
