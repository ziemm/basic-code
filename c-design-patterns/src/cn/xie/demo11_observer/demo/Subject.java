package cn.xie.demo11_observer.demo;

public interface Subject {
    public static String subjectState = null;
    void attach(Observer observer);
    void dettach(Observer observer);
    void notifyObservers();

}
