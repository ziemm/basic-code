package cn.xie.demo21_chain_of_Responsbility.demo;

/**
 * @author: xie
 * @create: 2020-04-24 16:35
 **/
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType()=="请假"&& request.getNumber()<=5){
            System.out.println(this.name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else {
            if(superior!=null){
                superior.requestApplication(request);
            }
        }
    }
}
