package com.qc.designmode.other.delegate;


/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class BackGround implements Itarget {
    @Override
    public void doSomethings(String commad) {
        System.out.println("I am Java engineer to coding Java background");
    }
}
