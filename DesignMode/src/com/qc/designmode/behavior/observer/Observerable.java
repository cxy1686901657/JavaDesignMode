package com.qc.designmode.behavior.observer;


/**
 * @author qc
 * @date 2019/12/10
 * @description 抽象被观察者接口
 *   声明了添加、删除、通知观察者方法
 * @project JavaDesignMode
 * @solving
 */

public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
