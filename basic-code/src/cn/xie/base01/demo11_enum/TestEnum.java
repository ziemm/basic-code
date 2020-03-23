package cn.xie.base01.demo11_enum;

/**
 * @author: xie
 * @create: 2020-02-18 12:50
 **/
public class TestEnum {
    public static void main(String[] args) {
         //枚举类中方法测试
         System.out.println(Season.SPRING.getName());
         //实现接口中的方法测试
         Season.AUTUMN.print();
         //运用switch

        //必须初始值
        Season season = Season.WINTER;
        switch (season){
            case AUTUMN:
                season.print();
                break;
            case SPRING:
                season.print();
                break;
            case SUMMER:
                season.print();
                break;
            case WINTER:
                season.print();
                break;
        }
    }
}
