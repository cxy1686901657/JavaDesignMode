package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description 单例模式-饿汉式（静态变量）
 * @project JavaDesignMode
 */

public class SingleTon1 {

    private SingleTon1() {

    }
    //2.本类内部创建对象实例
    private final static SingleTon1 instance = new SingleTon1();

    //3. 提供一个公有的静态方法，返回实例对象
    public static SingleTon1 getInstance() {
        return instance;
    }
}
