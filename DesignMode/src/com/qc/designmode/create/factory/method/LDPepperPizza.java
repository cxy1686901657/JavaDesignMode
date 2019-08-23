package com.qc.designmode.create.factory.method;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
