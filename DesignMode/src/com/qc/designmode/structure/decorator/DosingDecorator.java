package com.qc.designmode.structure.decorator;

/**
 * @author qc
 * @date 2019/11/29
 * @description
 * @project JavaDesignMode
 * @solving
 */

public  class DosingDecorator extends Tea  {
    private Tea tea;

    public DosingDecorator(Tea tea) {
        this.tea = tea;
    }

     void desc(){
        tea.desc();;
     }
     double price(){
        return tea.price();
     }
}
