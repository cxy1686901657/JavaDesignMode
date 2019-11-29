package com.qc.designmode.structure.decorator;

/**
 * @author qc
 * @date 2019/11/29
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class YanMai extends DosingDecorator {
    public YanMai(Tea tea) {
        super(tea);
    }

    @Override
    void desc() {
        super.desc();
        System.out.println("+YanMai");
    }

    @Override
    double price() {
        return super.price()+5.0;
    }
}
