package cn.xie.homework1;



import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        int solution = solution(str);
        System.out.println(solution);
    }
    public static int solution(String str){
        if(str==null || str.length()==0)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if(!((s>='0'&&s<='9')||(s>='A'&&s<='Z')||(s>='a'&&s<='z')||(s==' ')))
                count++;
        }
        return count;
    }
}
