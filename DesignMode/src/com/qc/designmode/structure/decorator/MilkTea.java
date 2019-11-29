package com.qc.designmode.structure.decorator;

/**
 * @author qc
 * @date 2019/11/29
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class MilkTea extends Tea {
    @Override
    void desc() {
        System.out.println("奶茶");
    }

    @Override
    double price() {
        return 10;
    }
}
