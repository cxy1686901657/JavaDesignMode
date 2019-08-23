package com.qc.designmode.create.factory.method.order;

import com.qc.designmode.create.factory.method.Pizza;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class PizzaStore {
    public static void main(String[] args){
        Pizza cheese = new BJOrderPizza().createPizza("cheese");
        System.out.println(cheese);
    }
}
