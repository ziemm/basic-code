package cn.itcast.day07.demo07_Exception;

/**
 * 自定义异常类
 * public class xxxException extends Exception/RuntimeException{
 *     添加一个空参数构造方法
 *     添加一个带异常信息的构造方法
 *   注意继承两种异常的方法区别
 *     Exception：属于典型的异常
 *     RuntimeException：属于自定义异常，无需处理，交给虚拟机处理（中断处理）
 * }
 *
 * @author: xie
 * @create: 2019-10-03 13:05
 **/
public class RegisterException extends Exception{
    public RegisterException() {
        super();
    }
    /**
    * @Description: 调用父类带参构造方法
    * @Param: [message]
    * @return:
    */
    public RegisterException(String message) {
        super(message);
    }
}
