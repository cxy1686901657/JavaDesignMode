package com.qc.designmode.behavior.strategy;

/**
 * @author qc
 * @date 2019/12/13
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class Enviroment {
    private Strategy strategy;

    public Enviroment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int agro(int i, int j) {
        return strategy.agro(i, j);
    }
}