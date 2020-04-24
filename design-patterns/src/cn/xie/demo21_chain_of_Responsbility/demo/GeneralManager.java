package cn.xie.demo21_chain_of_Responsbility.demo;

/**
 * @author: xie
 * @create: 2020-04-24 16:36
 **/
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType()=="请假"){
            System.out.println(this.name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else if(request.getRequestType()=="加薪"&&request.getNumber()<=500){
            System.out.println(this.name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }else if(request.getRequestType()=="加薪"&&request.getNumber()>500){
            System.out.println(this.name+":"+request.getRequestContent()+"数量"+request.getNumber()+"再说吧");

        }
    }
}
