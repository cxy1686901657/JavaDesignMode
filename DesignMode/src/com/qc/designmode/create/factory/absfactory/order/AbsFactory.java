package com.qc.designmode.create.factory.absfactory.order;

import com.qc.designmode.create.factory.absfactory.Pizza;

/**
 * @author qc
 * @date 2019/8/23
 * @description
 * @project JavaDesignMode
 */
public interface AbsFactory {
     Pizza createPizza(String orderType);
}
