package com.xie.polymorphic;

/**
 * @author: xie
 * @create: 2020-03-20 15:52
 **/
public class DynamicDispatch {
    static abstract class Human {
        public abstract void sayHello();
    }
    static class Man extends Human {
        @Override
        public void sayHello() {
            System.out.println("hello Man");
        }
    }

    static class Woman extends Human {
        @Override
        public void sayHello() {
            System.out.println("hello Woman!");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }

}
