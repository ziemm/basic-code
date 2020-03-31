package com.xie.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * @author: xie
 * @create: 2020-03-31 09:40
 **/
public class Test {
    class GrandFather{
        void thinking(){
            System.out.println("i am grandFather");
        }
    }

    class Father extends GrandFather{
        @Override
        void thinking() {
            System.out.println("i am father");
        }
    }
    class Son extends Father{
        @Override
        void thinking() {
            try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh = lookup().findSpecial(GrandFather.class, "thinking", mt, getClass());
                mh.invoke(this);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        (new Test().new Son()).thinking();
    }
}
