package com.qc.designmode.behavior.chain;

/**
 * @author qc
 * @date 2019/12/15
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Soilder extends Handler {
    private int type=0;
    private Handler handler;


    @Override
    public void handler(String msg, int type) {
        if(type==this.type){
            System.out.println("Soilder handler");
            return;
        }
        this.handler.handler(msg, type);
        System.out.println("Soilder dont handler");
    }

    @Override
    public void setSuccessor(Handler successor) {
        this.handler=successor;
    }

    @Override
    public Handler getSuccessor() {
        return this.handler;
    }
}
