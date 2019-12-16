package com.qc.designmode.other.delegate.jvmparent;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class ExtClassLoader extends GetClass{
    public ExtClassLoader(){
        super.setParent(new BootStrapClassLoader());
    }
    @Override
    public Class<?> findClass(String name) {
        System.out.println(getClass().getName() + "------>Get");
        if(name.equals("com.ext.Hello"))return ExtClassLoader.class;
        return null;
    }
}
