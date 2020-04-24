package cn.xie.demo21_chain_of_Responsbility;

/**
 * @author: xie
 * @create: 2020-04-24 16:11
 **/
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcrereHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] request = {2,5,14,22,18,3,27,20};

        for (int i : request) {
            h1.HandleRequest(i);
        }
    }
}
