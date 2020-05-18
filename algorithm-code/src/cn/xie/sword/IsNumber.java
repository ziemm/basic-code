package cn.xie.sword;

/**
 * A[.[b][e|EC]]
 * .B[e|EC]
 *
 * @author: xie
 * @create: 2020-05-14 15:48
 **/
public class IsNumber {
    int i = 0;

    public boolean isNumber(String s) {
        if(s==null||s.length()==0){
            return false;
        }
        s=s.trim();
        boolean A = scanInteger(s),B=false,C=false;

        //判断是否有B
        if(i<s.length()&&s.charAt(i)=='.'){
            i++;
            B=scanUnsignedInteger(s);
        }

        //判断是否有C
        if(i<s.length()&&(s.charAt(i)=='E'||s.charAt(i)=='e')){
            i++;
            C=scanInteger(s);
            //如果存在E|e 但没有C
            if(C==false)
                return false;
        }

        //扫描完整个字符串，且（有A则有没有B都可，没A则必须有B）
        return i==s.length()&&(A||B);
    }

    private boolean scanInteger(String s){
        if(i<s.length()&&(s.charAt(i)=='+'||s.charAt(i)=='-'))
            i++;
        return scanUnsignedInteger(s);
    }

    private boolean scanUnsignedInteger(String s) {
        //开始索引
        int start = i;
        while (i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            i++;
        }
        //i>start
        //i<=start
        return i>start;
    }
}
