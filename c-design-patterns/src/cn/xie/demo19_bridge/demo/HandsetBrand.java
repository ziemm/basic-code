package cn.xie.demo19_bridge.demo;

/**
 * @author: xie
 * @create: 2020-04-23 11:20
 **/
public abstract class HandsetBrand {
    protected HandSetSoft soft;

    public void setHandsetSoft(HandSetSoft soft){
        this.soft=soft;
    }

    public abstract void run();
}
