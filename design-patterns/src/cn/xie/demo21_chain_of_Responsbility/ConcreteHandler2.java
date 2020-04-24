package cn.xie.demo21_chain_of_Responsbility;

/**
 * @author: xie
 * @create: 2020-04-24 16:08
 **/
public class ConcreteHandler2 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request>=10&&request<20){
            System.out.println("处理请求"+this.getClass().getSimpleName());
        }
        else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
