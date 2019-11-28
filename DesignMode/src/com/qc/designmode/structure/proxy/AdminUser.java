package com.qc.designmode.structure.proxy;

/**
 * @author qc
 * @date 2019/11/28
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class AdminUser implements User {
    @Override
    public void smoke() {
        System.out.println("smoke hetianxia----");
    }
}
