package com.qc.designmode.behavior.observer;

/**
 * @author qc
 * @date 2019/12/10
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class User implements Observer {
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
