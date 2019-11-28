package com.qc.designmode.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qc
 * @date 2019/11/28
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class AdminUserProxy implements InvocationHandler {
    Object object;
    Aspect aspect;
    public AdminUserProxy(Object o,Aspect aspect){
        this.object=o;
        this.aspect=aspect;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        aspect.pre();
        Object invoke = method.invoke(object, args);
        aspect.end();
        return invoke;
    }

    public static void main(String[] args) {
        AdminUserProxy adminUserProxy = new AdminUserProxy(new AdminUser(), new Aspect());
        User proxy = (User) adminUserProxy.getProxy();
        proxy.smoke();
    }
}
