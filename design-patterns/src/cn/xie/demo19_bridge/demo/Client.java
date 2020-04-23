package cn.xie.demo19_bridge.demo;

/**
 * @author: xie
 * @create: 2020-04-23 11:24
 **/
public class Client {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandN();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

    }
}
