package cn.xie.xml.jsoup;


import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *Xpath查询  根据w3c XML 中的Xpath参考手册来定义查找参数
 *
 */
public class JsoupDemo6 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //1.获取student.xml的path
        String path = JsoupDemo6.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

        //3根据document对象，创建JXDocument
        JXDocument jxDocument = new JXDocument(document);

        //4结合Xpath语法查询
        List<JXNode> jxNodes = jxDocument.selN("//student");
//        for (JXNode jxNode : jxNodes) {
//            System.out.println(jxNode);
//        }
        System.out.println("--------------------");
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
//        for (JXNode jxNode : jxNodes) {
//            System.out.println(jxNode);
//        }

        //4.3查询student标签下带有id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }

    }

}
