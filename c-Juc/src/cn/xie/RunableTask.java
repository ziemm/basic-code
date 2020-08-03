package cn.xie;

/**
 * @author: xie
 * @create: 2020-05-10 17:41
 **/
public class RunableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm a child Thread by Runable");
    }

    public static void main(String[] args) {

        RunableTask task = new RunableTask();


        new Thread(task).start();
        new Thread(task).start();
    }
}
