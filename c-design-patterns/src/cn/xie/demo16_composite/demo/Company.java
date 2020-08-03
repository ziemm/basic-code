package cn.xie.demo16_composite.demo;

/**
 * @author: xie
 * @create: 2020-04-21 23:03
 **/
public abstract class Company {
    protected String name;
    public Company(String name){
        this.name=name;
    }

    public abstract void add(Company c); //
    public abstract void remove(Company c); //
    public abstract void display(int depth); //
    public abstract void LineOfDuty(); //
}
