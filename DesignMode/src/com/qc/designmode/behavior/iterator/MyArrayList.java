package com.qc.designmode.behavior.iterator;

import java.util.List;

/**
 * @author qc
 * @date 2019/12/3
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class MyArrayList extends AbstractObjectList {
    public MyArrayList(List<Object> list) {
        super(list);
        // TODO Auto-generated constructor stub
    }

    @Override
    public AbstractIterator createIterator() {
        // TODO Auto-generated method stub

        return new ProducteIterator(this);
    }
}
