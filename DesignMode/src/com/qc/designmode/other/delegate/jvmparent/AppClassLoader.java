package com.qc.designmode.other.delegate.jvmparent;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class AppClassLoader extends GetClass{
   public AppClassLoader(){
       super.setParent(new ExtClassLoader());
   }
    @Override
    public Class<?> findClass(String name) {
        System.out.println(getClass().getName() + "------>Get");
        if(name.equals("com.qc.Hello"))return AppClassLoader.class;
        return null;
    }
}
