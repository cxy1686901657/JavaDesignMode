package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description 单例模式-饿汉式（静态代码块）
 * @project JavaDesignMode
 */

public class SingleTon2 {
    private SingleTon2(){ }
    //2.本类内部创建对象实例
    private  static SingleTon2 instance;

    static { // 在静态代码块中，创建单例对象
        instance = new SingleTon2();
    }
    //3. 提供一个公有的静态方法，返回实例对象
    public static SingleTon2 getInstance() {
        return instance;
    }

}
