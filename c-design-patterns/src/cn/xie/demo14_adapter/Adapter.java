package cn.xie.demo14_adapter;

/**
 * 通过包装一个adaptee对象把源接口转换成目标接口
 * @author: xie
 * @create: 2020-04-21 09:40
 **/
public class Adapter extends Target{
    private  Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
