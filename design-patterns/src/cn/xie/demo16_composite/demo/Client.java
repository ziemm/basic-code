package cn.xie.demo16_composite.demo;

/**
 * @author: xie
 * @create: 2020-04-21 23:19
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东公司人力资源部"));
        comp.add(new FinanceDepartment("华东公司财务部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new HRDepartment("南京办事处财务处"));
        comp.add(comp1);

        ConcreteCompany comp2= new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new HRDepartment("杭州办事处财务处"));
        comp.add(comp2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责：");
        root.LineOfDuty();
    }
}
