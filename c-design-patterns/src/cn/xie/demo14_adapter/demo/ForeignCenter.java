package cn.xie.demo14_adapter.demo;

/**
 * 姚明（外籍中锋）无法适配英语环境
 * @author: xie
 * @create: 2020-04-21 09:49
 **/
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void attackC(){
        System.out.println("外籍中锋进攻");
    };
    public  void defenseC(){
        System.out.println("外籍中锋防守");
    };
}
