package cn.xie.homework1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: xie
 * @create: 2020-08-13 20:14
 **/
public class Solution {
    public static void main(String[] args) {

    }

    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> res = new ArrayList<>();

        ArrayList<String> sample = values.get(0);
        List<Map<String,String>> les = new ArrayList<>();
        for (int i = 1; i < values.size(); i++) {
            Map<String,String> temp = new HashMap<>();
            ArrayList<String> list = values.get(i);
            for (String s : list) {
                temp.put(s,"");
            }
            les.add(temp);
        }

        for (String s : sample) {
            boolean flag =true;
            for (Map<String, String> le : les) {
                if(!le.containsKey(s)){
                    flag = false;
                    break;
                }
            }
            if(flag)
                res.add(s);
        }
      return res;
    }
}