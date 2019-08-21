package com.qc.designmode.create.singleton;

/**
 * @author qc
 * @date 2019/8/21
 * @description
 * @project JavaDesignMode
 */

public enum  SingleTon7 {
    INSTANCE(1);
    private Integer id;

    SingleTon7(Integer id) {
        this.id = id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
