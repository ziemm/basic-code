package cn.itcast.day07.demo04;

/**
 * @author: xie
 * @create: 2019-09-11 22:39
 **/
public class Person {
    private boolean live =true;
    class Heart{

        public void jump(){
            //直接访问外部成员
            if(live){
                System.out.println("心脏在跳动");
            }else{
                System.out.println("心脏不跳了！");
            }
        }

    }

}
