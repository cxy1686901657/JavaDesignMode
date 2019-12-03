package com.qc.designmode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qc
 * @date 2019/12/3
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class ProducteIterator extends AbstractIterator {
    private List<Object> objectList = new ArrayList<Object>();
    private int cursor1;	//游标
    private int cursor2;	//游标2

    public ProducteIterator(MyArrayList obj) {
        // TODO Auto-generated constructor stub
        this.objectList=obj.getObjectList();
        cursor1=0;
        cursor2=objectList.size()-1;
    }
    @Override
    public void next() {
        // TODO Auto-generated method stub
        if(cursor1<objectList.size()) {
            cursor1++;
        }
    }

    @Override
    public void previous() {
        // TODO Auto-generated method stub
        if(cursor2>-1) {
            cursor2--;
        }
    }

    @Override
    public Object getPrevious() {
        // TODO Auto-generated method stub
        return objectList.get(cursor2);
    }

    @Override
    public Object getNext() {
        // TODO Auto-generated method stub
        return objectList.get(cursor1);
    }

    @Override
    public boolean isNext() {
        // TODO Auto-generated method stub
        return (cursor1==objectList.size());
    }

    @Override
    public boolean isFrist() {
        // TODO Auto-generated method stub
        return (cursor2==-1);
    }
}
