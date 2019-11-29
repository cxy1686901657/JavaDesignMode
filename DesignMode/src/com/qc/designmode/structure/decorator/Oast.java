package com.qc.designmode.structure.decorator;

/**
 * @author qc
 * @date 2019/11/29
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Oast extends DosingDecorator {

    public Oast(Tea tea) {
        super(tea);
    }

    @Override
    void desc() {
       super.desc();
        System.out.println("+Oast");
    }

    @Override
    double price() {
        return super.price()+4.0;
    }
}
