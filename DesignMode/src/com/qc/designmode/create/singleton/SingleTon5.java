package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description 双重检查
 * @project JavaDesignMode
 */

public class SingleTon5 {
    private static volatile SingleTon5 instance;

    private SingleTon5() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用

    public static  SingleTon5 getInstance() {
        if(instance == null) {
            synchronized (SingleTon5.class) {
                if(instance == null) {
                    instance = new SingleTon5();
                }
            }

        }
        return instance;
    }
}
