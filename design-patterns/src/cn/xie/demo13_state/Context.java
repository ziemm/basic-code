package cn.xie.demo13_state;

/**
 * Context类，维护一个子类实例，该实例定义当前的状态
 * @author: xie
 * @create: 2020-04-20 23:09
 **/
public class Context {
    private State state;

    public Context(State state){
        this.state=state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.getClass().getName());
    }

    public void request(){
        state.Handle(this);
    }
}
