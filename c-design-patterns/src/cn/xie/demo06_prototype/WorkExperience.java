package cn.xie.demo06_prototype;

/**
 * @author: xie
 * @create: 2020-04-19 09:33
 **/
public class WorkExperience implements Cloneable {
    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    //深复制的实现
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
