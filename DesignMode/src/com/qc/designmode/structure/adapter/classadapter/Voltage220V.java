package com.qc.designmode.structure.adapter.classadapter;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */

public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
