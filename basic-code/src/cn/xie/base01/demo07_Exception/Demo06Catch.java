package cn.xie.base01.demo07_Exception;

import java.util.ArrayList;
import java.util.List;

/**
 * catch处理的注意事项
 * @author: xie
 * @create: 2019-10-03 10:36
 **/
public class Demo06Catch {
    public static void main(String[] args) {
        try {
            int[] arr ={11,33,44};
            System.out.println(arr[3]);
            List<Integer> list= new ArrayList<Integer>();
            list.add(11);
            list.add(33);
            list.add(44);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e) {   //有多个异常需要catch时，子类放在前面，因为java会将异常对象一次赋值给下面
                                                      //的catch。如果父类写在前面，会以多态new对象，导致
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


}
