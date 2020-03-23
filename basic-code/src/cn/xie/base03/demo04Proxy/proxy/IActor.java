package cn.xie.base03.demo04Proxy.proxy;

/**
 * 基于jdk官方的proxy的实现所需的接口
 */
public interface IActor {
    /**
     * 基本演出
     * @param money
     */
    public void baseAct(float money);

    public void dangerAct(float money);

    /**
     * 特别演出，会返回收到演出费用的一部分用于消费
     * @param money
     * @return  演出费用的一部分用于消费
     */
    public float  specialAct(float money);

}
