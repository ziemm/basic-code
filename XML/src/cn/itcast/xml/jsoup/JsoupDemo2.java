package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Jsoup对象功能
 * @author: xie
 * @create: 2019-10-29 19:51
 **/
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象，根据行xml文档获取
        //1.1 获取studennt.xml的path
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //1.2解析行xml文档进内存，获取dom树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //System.out.println(document);

        /*String str = "\"C:\\Program Files\\Java\\jdk1.8.0_221\\bin\\java.exe\" \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2019.1.3\\lib\\idea_rt.jar=12757:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2019.1.3\\bin\" -Dfile.encoding=UTF-8 -classpath \"C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\deploy.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\access-bridge-64.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\cldrdata.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\dnsns.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\jaccess.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\jfxrt.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\localedata.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\nashorn.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\sunec.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\sunjce_provider.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\sunmscapi.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\sunpkcs11.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext\\zipfs.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\javaws.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\jfxswt.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\management-agent.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\plugin.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\rt.jar;E:\\myIdeaProjects\\basic-code\\out\\production\\XML;E:\\myIdeaProjects\\basic-code\\XML\\libs\\jsoup-1.11.2.jar\" cn.itcast.xml.jsoup.JsoupDemo2\n" +
                "<!--?xml version=\"1.0\" encoding=\"UTF-8\" ?-->\n" +
                "<!-- \n" +
                "\t1.填写xml文档的根元素\n" +
                "\t2.引入xsi前缀.  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\t3.引入xsd文件命名空间.  xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
                "\t4.为每一个xsd约束声明一个前缀,作为标识  xmlns=\"http://www.itcast.cn/xml\" \n" +
                "\t\n" +
                "\t\n" +
                " -->\n" +
                "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "  <students xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.itcast.cn/xml\" xsi:schemalocation=\"http://www.itcast.cn/xml  cn/itcast/xml/schema/student.xsd\"> \n" +
                "   <student number=\"heima_0001\"> \n" +
                "    <name>\n" +
                "     zhangsan\n" +
                "    </name> \n" +
                "    <age>\n" +
                "     25\n" +
                "    </age> \n" +
                "    <sex>\n" +
                "     female\n" +
                "    </sex> \n" +
                "   </student> \n" +
                "   <student number=\"heima_0002\"> \n" +
                "    <name>\n" +
                "     sunwukong\n" +
                "    </name> \n" +
                "    <age>\n" +
                "     23\n" +
                "    </age> \n" +
                "    <sex>\n" +
                "     male\n" +
                "    </sex> \n" +
                "   </student> \n" +
                "  </students>\n" +
                " </body>\n" +
                "</html>\n" +
                "\n" +
                "Process finished with exit code 0\n";
        Document document1 = Jsoup.parse(str);
        System.out.println(document1);*/

       /* //parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url= new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");
        Document document1 = Jsoup.parse(url, 2000);
        System.out.println(document1);*/


    }
}
