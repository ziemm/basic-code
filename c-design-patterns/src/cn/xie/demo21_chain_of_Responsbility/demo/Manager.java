package cn.xie.demo21_chain_of_Responsbility.demo;

/**
 * @author: xie
 * @create: 2020-04-24 16:21
 **/
public abstract class Manager {
    protected String name;

    protected Manager superior;//设置管理者的上级
    public Manager(String name){
        this.name=name;
    }

    public void setSuperior(Manager superior){
        this.superior=superior;
    }
    public abstract void requestApplication(Request request);
}
