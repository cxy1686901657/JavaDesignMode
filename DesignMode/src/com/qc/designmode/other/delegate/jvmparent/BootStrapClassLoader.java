package com.qc.designmode.other.delegate.jvmparent;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class BootStrapClassLoader extends GetClass{
    @Override
    public Class<?> findClass(String name) {
        System.out.println(getClass().getName() + "------>Get");
        if(name.equals("com.boot.Hello"))return BootStrapClassLoader.class;
        return null;
    }
}
