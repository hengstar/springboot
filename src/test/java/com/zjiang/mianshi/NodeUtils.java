package com.zjiang.mianshi;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * description: NodeUtils <br>
 * date: 2020/4/14 15:30 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class NodeUtils {
    static Node getNode(List<Node> nodes, String path) {
        Node node1 = new Node();
        for (Node node : nodes) {
            if(node.path.equals(path)){
                node1= node;
            }
            continue;
        }
        return node1;
    }

    @Test
    public void test(){
        Node node1 = new Node();
        node1.setPath("111");
        Node node2 = new Node();
        node2.setPath("222");
        node2.setValue("123");
        List<Map> list1=new ArrayList<Map>();
        node2.setChildren(list1);
        List<Node> list=new ArrayList<Node>();
        list.add(node1);
        list.add(node2);
        Node node=NodeUtils.getNode(list,"222");
        System.out.println(""+JSON.toJSONString(node));
    }
}
