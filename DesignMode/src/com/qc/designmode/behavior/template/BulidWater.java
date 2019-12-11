package com.qc.designmode.behavior.template;

/**
 * @author qc
 * @date 2019/12/11
 * @description
 * @project JavaDesignMode
 * @solving
 */

public abstract class BulidWater {
    final void bulid() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    abstract void brew();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }
}
