package cn.xie.demo04_proxy;

/**
 * @author: xie
 * @create: 2020-04-18 10:43
 **/
public class Client {
    public static void main(String[] args) {
        SchoolGirl jiaojiao  = new SchoolGirl();
        jiaojiao.setName("jiaojiao");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChoolate();
    }
}
