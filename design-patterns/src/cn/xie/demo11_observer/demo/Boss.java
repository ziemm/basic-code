package cn.xie.demo11_observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-20 10:13
 **/
public class Boss implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
