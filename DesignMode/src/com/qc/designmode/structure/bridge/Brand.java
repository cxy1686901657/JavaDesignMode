package com.qc.designmode.structure.bridge;

/**
 * @author qc
 * @date 2019/9/15
 * @description 桥接模式 抽象与实现分离
 * @project JavaDesignMode
 *
 *
 */
//接口
public interface Brand {
    void open();
    void close();
    void call();
}