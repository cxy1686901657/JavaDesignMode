package com.qc.designmode.behavior.chain;

/**
 * @author qc
 * @date 2019/12/15
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Minister extends Handler {
    private int type=1;
    private Handler handler;
    @Override
    public void handler(String msg, int type) {
        if(type==this.type){
            System.out.println("Minister handler");
            return;
        }
        this.handler.handler(msg, type);
        System.out.println("Minister dont handler");
    }

    @Override
    public void setSuccessor(Handler successor) {
        this.handler=successor;
    }

    @Override
    public Handler getSuccessor() {
        return handler;
    }
}
