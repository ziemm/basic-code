package cn.xie.www;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author: xie
 * @create: 2019-11-26 20:56
 **/
public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(null);
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        /*
         * 使用迭代器遍历集合
         */
        //获取迭代器
        java.util.Iterator<String> it = list.iterator();
        //使用while遍历集合
        while (it.hasNext()) {
            String s = it.next();

            /*
             * 判断集合中有没有"abc3"这个元素
             * 如果有,增加一个元素"itcast"
             * 编程技巧:使用equals判断的时候,要把已知的变量写在前边,未知的写在后边,防止空指针异常
             */
            //if(s.equals("abc3")){
            if ("abc3".equals(s)) {
                //1.迭代就是迭代,不要对集合进行修改
                //list.add("itcast");
            }

            System.out.println(s);
        }

        System.out.println("------------------");

         //2.使用迭代器Iterator的子接口ListIterator中的方法add/remove,让迭代器自己增加往集合中增加元素/移除元素

        ListIterator<String> listIt = list.listIterator();
        while(listIt.hasNext()){
            String s = listIt.next();
            if("abc3".equals(s)){
                listIt.add("itcast");
            }
            System.out.println(s);
        }
        System.out.println(list);
    }

}
