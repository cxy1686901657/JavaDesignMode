package com.qc.designmode.behavior.template;


/**
 * @author qc
 * @date 2019/12/11
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Client {

    public static void main(String[] args) {
        BulidWater caffeineBeverage = new Coffee();
        caffeineBeverage.bulid();
        System.out.println("-----------");
        caffeineBeverage = new Milk();
        caffeineBeverage.bulid();
    }

}
