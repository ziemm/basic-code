package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document、Elenment对象的使用
 * @author: xie
 * @create: 2019-10-29 19:51
 **/
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象，根据行xml文档获取
        //1.1 获取studennt.xml的path
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //1.2解析行xml文档进内存，获取dom树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //2获取Element对象
        //2.1 获取所有student对象
        Elements elements = document.getElementsByTag("name");  //此处可以获得所有name标签
        System.out.println(elements);
        System.out.println("-------------------");
        Element ele_studet = document.getElementsByTag("student").get(0);
        Elements ele_name = ele_studet.getElementsByTag("name");
        System.out.println(ele_name);

        //获取对象的属性值
        String number = ele_studet.attr("number");
        System.out.println(number);

       /* System.out.println("-----------------");
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);*/

    }
}
