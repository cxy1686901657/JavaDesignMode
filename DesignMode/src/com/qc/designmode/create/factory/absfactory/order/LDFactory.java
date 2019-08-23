package com.qc.designmode.create.factory.absfactory.order;
import com.qc.designmode.create.factory.absfactory.LDCheesePizza;
import com.qc.designmode.create.factory.absfactory.LDPepperPizza;
import com.qc.designmode.create.factory.absfactory.Pizza;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class LDFactory implements  AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
