package com.qc.designmode.create.factory.simplefactory.order;

import com.qc.designmode.create.factory.simplefactory.CheesePizza;
import com.qc.designmode.create.factory.simplefactory.GreekPizza;
import com.qc.designmode.create.factory.simplefactory.PepperPizza;
import com.qc.designmode.create.factory.simplefactory.Pizza;

/**
 * @author qc
 * @date 2019/8/21
 * @description
 * @project JavaDesignMode
 */

public class SimpleFactory {
    //简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
