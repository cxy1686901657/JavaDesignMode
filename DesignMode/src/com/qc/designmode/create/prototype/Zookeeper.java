package com.qc.designmode.create.prototype;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */

public class Zookeeper {
    public static void main(String[] args){
        Sheep sheep = new Sheep();
        sheep.setName("abc");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep2);
        System.out.println(sheep);
    }
}
