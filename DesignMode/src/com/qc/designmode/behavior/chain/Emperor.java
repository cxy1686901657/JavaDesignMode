package com.qc.designmode.behavior.chain;

/**
 * @author qc
 * @date 2019/12/15
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Emperor extends Handler {
    private int type=2;
    private  Handler handler;
    @Override
    public void handler(String msg, int type) {
        if(type==this.type){
            System.out.println("Emperor handler");
            return;
        }
        if(handler!=null){
            this.handler.handler(msg, type);
        }
        System.out.println("Emperor dont handler");
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
