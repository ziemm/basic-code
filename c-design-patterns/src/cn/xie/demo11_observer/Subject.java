package cn.xie.demo11_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-20 09:33
 **/
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    //增加观察者
    public void Attch(Observer observer){
        observers.add(observer);
    }
    //移出观察者
    public void Detach(Observer observer){
        observers.remove(observer);
    }

    //通知观察者
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
