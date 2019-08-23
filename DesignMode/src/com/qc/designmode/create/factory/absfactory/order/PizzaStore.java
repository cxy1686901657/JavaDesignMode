package com.qc.designmode.create.factory.absfactory.order;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class PizzaStore {
    public static void main(String[] args){
        OrderPizza orderPizza = new OrderPizza(new BJFactory());

    }
}
