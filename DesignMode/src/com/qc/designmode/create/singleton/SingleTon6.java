package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description
 * @project JavaDesignMode
 */

public class SingleTon6 {
    private static volatile SingleTon6 instance;

    //构造器私有化
    private SingleTon6() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final SingleTon6 INSTANCE = new SingleTon6();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE

    public static synchronized SingleTon6 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
