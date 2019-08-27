package com.qc.designmode.structure.adapter.classadapter;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */

public class Adapter extends Voltage220V implements  IVoltage5V{

    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44 ; //转成 5v
        return dstV;
    }
}
