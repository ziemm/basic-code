package cn.xie.demo11_observer;

/**
 * 具体主体或具体通知者
 * @author: xie
 * @create: 2020-04-20 09:39
 **/
public class ConcreteSubject extends Subject {

    //具体被观察者状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
