package com.qc.designmode.behavior.strategy;

/**
 * @author qc
 * @date 2019/12/13
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class SubtractStrategy implements Strategy {
    @Override
    public int agro(int i, int j) {
        return i / j;
    }
}
