package com.qc.designmode.other.delegate;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Client {
    public static void main(String[] args) {
        leader leader = new leader();
        leader.doSomethings("2");
    }
}
