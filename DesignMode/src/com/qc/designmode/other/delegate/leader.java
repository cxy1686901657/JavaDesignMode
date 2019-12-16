package com.qc.designmode.other.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */

public class leader implements Itarget {
    private Map<String , Itarget> map;

    public leader(){
        map=new HashMap<>();
        map.put("1", new UI());
        map.put("2", new BackGround());
    }

    @Override
    public void doSomethings(String commad) {
        map.get(commad).doSomethings(commad);
    }
}
