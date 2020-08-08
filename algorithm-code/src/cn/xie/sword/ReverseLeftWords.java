package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-07 16:21
 **/
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(n);
        String s2 =s.substring(0,n);

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2);
        return sb.toString();
    }
}
