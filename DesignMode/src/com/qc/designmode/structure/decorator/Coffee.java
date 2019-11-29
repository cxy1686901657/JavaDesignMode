package com.qc.designmode.structure.decorator;

/**
 * @author qc
 * @date 2019/11/29
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Coffee extends  Tea {
    @Override
    void desc() {
        System.out.println("咖啡");
    }

    @Override
    double price() {
        return 20;
    }
}
