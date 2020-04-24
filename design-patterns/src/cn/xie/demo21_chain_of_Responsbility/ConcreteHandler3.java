package cn.xie.demo21_chain_of_Responsbility;

/**
 * @author: xie
 * @create: 2020-04-24 16:10
 **/
public class ConcreteHandler3 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request>=20&&request<30){
            System.out.println("处理请求"+this.getClass().getSimpleName());
        }
        else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
