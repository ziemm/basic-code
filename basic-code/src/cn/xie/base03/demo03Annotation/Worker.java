package cn.xie.base03.demo03Annotation;

/**
 * @author: xie
 * @create: 2020-02-18 18:55
 **/
@MyAnno(age=12,per = Person.P1,anno2 = @MyAnno2,strs = "bbb")
@Myanno3
public class Worker {
    @Myanno3
    public String name="aaa";

    @Myanno3
    public void show(){}
}
