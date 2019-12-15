package com.qc.designmode.behavior.chain;

/**
 * @author qc
 * @date 2019/12/15
 * @description
 * @project JavaDesignMode
 * @solving
 */

public abstract class Handler {
    protected Handler handler;

    public abstract void handler(String msg,int type);

    public abstract void setSuccessor(Handler successor);

    public abstract Handler getSuccessor();

}
