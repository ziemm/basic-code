package cn.xie.sword;

/**
 * 05.空格替换
 * @author: xie
 * @create: 2020-03-01 19:25
 **/
public class ReplaceSpace {
    public static void main(String[] args) {
        String str = "We are happy";
        ReplaceSpace o = new ReplaceSpace();
        String s = o.replaceSpace(str);
        System.out.println(s);

    }

    public String replaceSpace(String s) {
       return s.replaceAll(" ","%20");
    }
}
