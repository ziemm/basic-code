package cn.xie.homework1;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        String res = solution(7);
        System.out.println(res);
    }
    /**
     *
     * @param row 下一行要输出的行号（例如：第7行）
     * @return 下一行结果
     */
    public static String solution(int row){
        if(row==1)
            return "1";
        if(row==2)
            return "11";
        String[] strs = new String[row];
        strs[0] = "1";
        strs[1] = "11";
        int j =0;
        String res = "";
        for (int i = 2; i < row; i++) {
            String tmp = strs[i-1];
            int n = 1;
            res = "";
            j=0;
            for ( n = 0; n <tmp.length()-1 ; n++) {
                if(tmp.charAt(n)==tmp.charAt(n+1)){
                    j++;
                }else {
                    j++;
                    res += ""+j+tmp.charAt(n);
                    j=0;
                }
            }
            j++;
            res += ""+j+tmp.charAt(n);
            strs[i] = res;
        }
        return res;
    }
}
