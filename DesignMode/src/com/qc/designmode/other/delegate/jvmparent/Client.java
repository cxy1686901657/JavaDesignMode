package com.qc.designmode.other.delegate.jvmparent;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Client {
    public static void main(String[] args) {
        AppClassLoader appClassLoader = new AppClassLoader();
        Class<?> aClass = appClassLoader.loadClass("com.qc.Hello");
        System.out.println(aClass.getName());
    }
}
