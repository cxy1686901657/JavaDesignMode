package com.qc.designmode.create.factory.absfactory.order;

import com.qc.designmode.create.factory.absfactory.BJCheesePizza;
import com.qc.designmode.create.factory.absfactory.BJPepperPizza;
import com.qc.designmode.create.factory.absfactory.Pizza;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
