package cn.xie.demo22_mediator;

/**
 * @author: xie
 * @create: 2020-04-27 16:47
 **/
public class Client {
    public static void main(String[] args) {
       ConcreteMediator m = new ConcreteMediator();
       ConcreteColleague1 c1 = new ConcreteColleague1(m);
       ConcreteColleague2 c2 = new ConcreteColleague2(m);
       m.setColleague1(c1);
       m.setColleague2(c2);

       c1.send("吃过饭了吗");
       c2.send("没有，你要请客吗？");
    }
}
