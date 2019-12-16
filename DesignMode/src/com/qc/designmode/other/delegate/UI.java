package com.qc.designmode.other.delegate;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class UI implements Itarget {
    @Override
    public void doSomethings(String commad) {
        System.out.println("draw UI");
    }
}
