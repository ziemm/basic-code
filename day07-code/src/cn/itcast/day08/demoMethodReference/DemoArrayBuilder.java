package cn.itcast.day08.demoMethodReference;

/**
 * @author: xie
 * @create: 2019-10-14 16:52
 **/
public class DemoArrayBuilder {
    public static void main(String[] args) {
        int[] array = initArray(10,length -> new int[length]);
        //优化的lambda写法，可以省去参数
        int[] array1 = initArray(10,int[]::new);

    }

    public static int[] initArray(int length,ArrayBuilder builder){
        return builder.builderArray(length);
    }
}
