package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-10-22 22:09
 **/
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < str.toString().length(); i++) {
            char c = str.charAt(i);
            if(c==' '){
                res.append("%20");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
