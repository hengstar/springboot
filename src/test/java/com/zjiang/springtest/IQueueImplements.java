package com.zjiang.springtest;

import java.util.ArrayList;
import java.util.List;

/**
 * description: IQueueImplements <br>
 * date: 2020/4/14 15:18 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class IQueueImplements implements Queue{
    @Override
    public boolean enqueue(Object o) {
        List queue=new ArrayList();
        queue.add(o);
        return false;
    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
