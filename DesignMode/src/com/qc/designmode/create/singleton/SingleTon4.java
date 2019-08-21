package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description
 * @project JavaDesignMode
 */

public class SingleTon4 {
    private static SingleTon4 instance;

    private SingleTon4() {}

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized SingleTon4 getInstance() {
        if(instance == null) {
            instance = new SingleTon4();
        }
        return instance;
    }
}
