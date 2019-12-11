package com.qc.designmode.behavior.template;

/**
 * @author qc
 * @date 2019/12/11
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Coffee extends BulidWater {
    @Override
     void addCondiments() {
        System.out.println("Coffee.brew");
    }

    @Override
     void brew() {
        System.out.println("Coffee.addCondiments");
    }
}
