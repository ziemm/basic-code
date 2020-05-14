package cn.xie.demo2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author: xie
 * @create: 2020-05-13 10:13
 **/
public class TestUnsafe {
   //static final Unsafe unsafe = Unsafe.getUnsafe();
    static final Unsafe unsafe;

   static final long stateOffset;

   static volatile long state = 0;

   static {
       try {

           //stateOffset = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
           Field field = Unsafe.class.getDeclaredField("theUnsafe");
           field.setAccessible(true);
           unsafe = (Unsafe) field.get(null);
           stateOffset = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
       } catch (Exception ex) {
           System.out.println(ex.getLocalizedMessage());
           throw new Error(ex);
       }
   }

    public static void main(String[] args) {
        TestUnsafe test = new TestUnsafe();
        boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }

}
