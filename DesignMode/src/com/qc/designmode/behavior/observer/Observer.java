package com.qc.designmode.behavior.observer;

/**
 * @author qc
 * @date 2019/12/10
 * @description
 * 抽象观察者
 *  * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * @project JavaDesignMode
 * @solving
 */

public interface Observer {
    public void update(String message);
}
