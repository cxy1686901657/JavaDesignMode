package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description 单例模式-懒汉式
 * @project JavaDesignMode
 */

public class SingleTon3 {
    private static SingleTon3 instance;

    private SingleTon3() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static SingleTon3 getInstance() {
        if(instance == null) {
            instance = new SingleTon3();
        }
        return instance;
    }
}
