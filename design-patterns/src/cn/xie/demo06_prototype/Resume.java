package cn.xie.demo06_prototype;

/**
 * @author: xie
 * @create: 2020-04-19 09:03
 **/
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience workExperience;


    public Resume (String name){
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public Resume (WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    //设置个人信息
    public void setPesonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }

    //显示
    public void disPlay() {
        System.out.println(name + sex + age);
        System.out.println(workExperience.getTimeArea() + workExperience.getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.age = this.age;
        obj.sex = this.sex;
        return obj;
    }
}
