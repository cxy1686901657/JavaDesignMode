package com.qc.designmode.behavior.chain;

/**
 * @author qc
 * @date 2019/12/15
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Client {
    public static void main(String[] args) {
        String msg="Find a Soilder to Slove Problems";
        Soilder soilder = new Soilder();
        Minister minister = new Minister();
        soilder.setSuccessor(minister);
        minister.setSuccessor(new Emperor());
        soilder.handler(msg,2);
    }
}
