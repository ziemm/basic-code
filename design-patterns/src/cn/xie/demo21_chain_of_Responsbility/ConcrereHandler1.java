package cn.xie.demo21_chain_of_Responsbility;

/**
 * @author: xie
 * @create: 2020-04-24 16:05
 **/
public class ConcrereHandler1 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request>=0&&request<10){
            System.out.println("处理请求"+this.getClass().getSimpleName());
        }
        else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
