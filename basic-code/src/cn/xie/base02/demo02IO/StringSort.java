package cn.xie.base02.demo02IO;

import java.io.*;
import java.util.HashMap;

/**
 * @author: xie
 * @create: 2019-10-05 16:51
 **/
public class StringSort {
    public static void main(String[] args) throws IOException {
        //创建排序要用的集合
        HashMap<String,String> mapLine = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("base01-code\\resources\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("base01-code\\resources\\out.txt"));

        //读取数据
        String line = null;
        while((line=br.readLine())!=null){
            //解析文本
            String[] splits = line.split("\\.");
            //存放
            mapLine.put(splits[0],splits[1]);
        }

        br.close();

        //遍历集合，无须排序，利用了HashMap的特性
        for (int i = 1; i < mapLine.size(); i++) {
            String key = String.valueOf(i);
            String value = mapLine.get(key);
            bw.write(key+"."+value);
            bw.newLine();
        }

        bw.close();

    }
}

