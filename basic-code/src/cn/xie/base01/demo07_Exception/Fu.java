package cn.xie.base01.demo07_Exception;

/**
 * @author: xie
 * @create: 2019-10-03 12:51
 **/
public class Fu {
    public void show01() throws NullPointerException,ClassCastException{};
    public void show02() throws IndexOutOfBoundsException{};
    public void show03() {};
}

class zi extends Fu{
    //子类重写父类方法时，可抛出与父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{};
    //子类重写父类方法时，可抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{};
    /*类重写父类方法时，父类没有抛出异常，子类也不可能以抛出异常
              //    public void show03() throws Exception{};
      如子类产生异常，只能捕获处理，不能声明抛出
    */
    public void show03(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
