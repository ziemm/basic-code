package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-19 13:53
 **/
public class StrToInt {
    public static void main(String[] args) {
        String str = "-2147483647";
        int res = StrToInt(str);
        System.out.println(res);
    }
    public static int StrToInt(String str) {
        if(str==null || str.length()==0)
            return 0;
        char[] numChars = str.trim().toCharArray();
        boolean flag =true;
        int res = 0;
        if(numChars[0]=='-'){
            flag=false;
        }else if(numChars[0]>='0'&&numChars[0]<='9'){
            res = numChars[0]-'0';
        }else if(numChars[0]!='+'){
            return 0;
        }
        for (int i = 1; i < numChars.length; i++) {
            if(numChars[i]>='0'&&numChars[i]<='9'){
                int num = numChars[i]-'0';
                res = res*10+num;
            }else {
                return 0;
            }
        }
        return flag ?res:-res;
    }
}
