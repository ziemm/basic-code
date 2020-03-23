package cn.xie.base01.demo05_Date;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: xie
 * @create: 2019-09-14 17:11
 **/
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("李五");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();//获取迭代出的元素
            System.out.println(s);
        }
    }
}
