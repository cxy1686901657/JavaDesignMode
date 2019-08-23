package com.qc.designmode.create.factory.method.order;

import com.qc.designmode.create.factory.method.LDCheesePizza;
import com.qc.designmode.create.factory.method.LDPepperPizza;
import com.qc.designmode.create.factory.method.Pizza;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}