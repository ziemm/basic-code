package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-29 19:51
 **/
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象，根据行xml文档获取
        //1.1 获取studennt.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //1.2解析行xml文档进内存，获取dom树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取Element对象
        Elements names = document.getElementsByTag("name");

        Element element = names.get(0);
        //System.out.println(name);
        String name =element.text();
        System.out.println(name);
    }
}
