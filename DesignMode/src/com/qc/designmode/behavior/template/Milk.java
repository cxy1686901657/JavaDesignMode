package com.qc.designmode.behavior.template;

/**
 * @author qc
 * @date 2019/12/11
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Milk extends  BulidWater {
    @Override
     void addCondiments() {
        System.out.println("Milk.add");
    }

    @Override
     void brew() {
        System.out.println("Milk.brew");
    }
}
