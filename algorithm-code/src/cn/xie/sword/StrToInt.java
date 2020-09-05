package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-09 17:36
 **/
public class StrToInt {
    public int strToInt(String str) {
        char[] c = str.trim().toCharArray();
        if(c.length==0)
            return 0;
        int res = 0,bndry = Integer.MAX_VALUE/10;
        int i = 1,sign =1;
        if(c[0]=='-')
            sign=-1;
        else if(c[0]!='+')
            i = 0;  //是'+'从1开始,不是'+',从0开始
        for(int j =i;j<c.length;j++){
            if(c[j]<'0'||c[j]>'9')
                break;
            if(res>bndry || res==bndry && c[j]>'7')  //res>bndry时，此时不管c[j]是几都越界
                return sign ==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res = res*10+(c[j]-'0');
        }
        return sign*res;
    }
}
