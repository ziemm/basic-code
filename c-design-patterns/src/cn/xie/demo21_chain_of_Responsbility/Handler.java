package cn.xie.demo21_chain_of_Responsbility;

/**
 * @author: xie
 * @create: 2020-04-24 16:02
 **/
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor=successor;
    }

    public abstract void HandleRequest(int request);
}
