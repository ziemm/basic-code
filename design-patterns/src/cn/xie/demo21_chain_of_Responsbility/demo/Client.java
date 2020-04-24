package cn.xie.demo21_chain_of_Responsbility.demo;

/**
 * @author: xie
 * @create: 2020-04-24 16:41
 **/
public class Client {
    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("金力");
        Majordomo zongjian = new Majordomo("宗建");
        GeneralManager zongjingli = new GeneralManager("钟精励");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jinli.requestApplication(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小菜请假");
        request1.setNumber(4);
        jinli.requestApplication(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContent("小菜加薪");
        request2.setNumber(400);
        jinli.requestApplication(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜加薪");
        request3.setNumber(800);
        jinli.requestApplication(request3);
    }
}
