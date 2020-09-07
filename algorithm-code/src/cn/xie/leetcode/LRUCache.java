package cn.xie.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xie
 * @create: 2020-09-06 12:19
 **/

public class LRUCache {
    class Node{
        int key,val;
        Node pre;
        Node next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    private Map<Integer,Node> map;
    private int cap;//缓存容量
    private  int size=0; //当前容量
    //双向链表的头尾哑节点
    Node head;
    Node tail;

    public LRUCache(int capacity){
        this.cap =capacity;
        //初始化双向链表
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.pre = head;
        map = new HashMap();
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            moveToHead(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        //如果缓存存在，则更新缓存中的值，并将缓存移动到头部
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            moveToHead(node);
        }else {//如果缓存不存在
           //判断当前缓存是否超出容量，超出则删除末尾元素，并并删除map对应的映射
            if(size>=cap){
                Node node = tail.pre;
                map.remove(node.key);
                size--;
                remove(node);
            }
            //如果没有超出缓存，就直接添加在头部
            Node node = new Node(key,value);
            map.put(key,node);
            size++;
            addToHead(node);
        }
    }

    private void remove(Node node){
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    private void addToHead(Node node){
        node.pre = head;
        node.next = head.next;
        head.next = node;
        node.next.pre = node;
    }

    /*从链表中删除并插入头部的操作*/
    private void moveToHead(Node node){
        remove(node);
        addToHead(node);
    }
}
