package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-11 20:02
 **/
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str==null || str.length()==0||str.trim().length()==0)
            return str;
        String[] strs = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length-1; i >= 0; i--) {
            sb.append(strs[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
