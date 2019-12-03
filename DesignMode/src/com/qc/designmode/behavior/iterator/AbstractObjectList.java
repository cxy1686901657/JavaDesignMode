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

public abstract class AbstractObjectList {
    protected List<Object> objectList = new ArrayList<Object>();
    public AbstractObjectList(List<Object> list) {
        // TODO Auto-generated constructor stub
        this.objectList=list;
    }
    //添加方法。
    public void AddObject(Object o) {
        this.objectList.add(o);
    }
    //删除方法。
    public void RemoveObject(Object o) {
        this.objectList.remove(o);
    }
    //获取到list
    public List<Object> getObjectList(){
        return objectList;
    }
    //获取arrayList
    //获取迭代器的工厂方法
    public abstract AbstractIterator createIterator();
}
