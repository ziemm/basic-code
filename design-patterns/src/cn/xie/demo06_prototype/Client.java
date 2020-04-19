package cn.xie.demo06_prototype;

/**
 * @author: xie
 * @create: 2020-04-19 09:15
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPesonalInfo("男","25");
        a.setWorkExperience("1988-2000","A公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1988-2006","B公司");

        Resume c = (Resume)b.clone();
        c.setPesonalInfo("男","30");
        b.setWorkExperience("1988-2003","C公司");

        a.disPlay();
        b.disPlay();
        c.disPlay();
    }

}
