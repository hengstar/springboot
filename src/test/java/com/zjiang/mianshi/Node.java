package com.zjiang.mianshi;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * description: Node <br>
 * date: 2020/4/14 15:28 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Data
public class Node {
    String path;
    String value;
    List<Map> children;
}
