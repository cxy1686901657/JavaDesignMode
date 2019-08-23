package com.qc.designmode.create.factory.method.order;

import com.qc.designmode.create.factory.method.BJCheesePizza;
import com.qc.designmode.create.factory.method.BJPepperPizza;
import com.qc.designmode.create.factory.method.Pizza;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class BJOrderPizza extends  OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
