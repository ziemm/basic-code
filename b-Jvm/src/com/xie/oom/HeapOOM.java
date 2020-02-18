package com.xie.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * -----虚拟机参数配置-----
 * -Xms20m
 * -Xmx20m
 * -XX:+HeapDumpOnOutOfMemoryError
 * @author: xie
 * @create: 2020-02-18 23:36
 **/
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
