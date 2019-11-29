package com.qc.designmode.structure.decorator;

/**
 * @author qc
 * @date 2019/11/29
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Client {
    public static void main(String[] args) {
        Tea coffee = new Coffee();
        coffee.desc();
        System.out.println(coffee.price());
        coffee=new YanMai(coffee);
        coffee.desc();;
        System.out.println(coffee.price());
    }
}
