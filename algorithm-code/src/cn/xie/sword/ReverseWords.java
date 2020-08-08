package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-06 22:00
 **/
public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords o = new ReverseWords();
        String s = "a good    example";
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            System.out.println(i+split[i]+i);
        }

    }

    public String reverseWords(String s) {
        if (s == null || s.length() <= 0)
            return "";
        String[] s1 = s.trim().split(" ");
        String temp;
        StringBuffer sb = new StringBuffer();
        for (int i = s1.length-1; i >=0; i--) {
            if(s1[i].equals(""))
                continue;
            sb.append(s1[i].trim()).append(" ");
        }
        return sb.toString().trim();
    }
}
