package cn.xie.nowcoder;


/**
 * @author: xie
 * @create: 2020-12-11 19:47
 **/
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0||n>str.length())
            return "";
        String s1 = str.substring(0,n);
        String s2 = str.substring(n);
        StringBuilder sb = new StringBuilder();
        sb.append(s2).append(s1);

        return sb.toString();
    }
}
