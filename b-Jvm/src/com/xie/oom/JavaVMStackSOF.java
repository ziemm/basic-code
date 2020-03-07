package com.xie.oom;

/**
 * VM Args:-Xss 128k
 * @author: xie
 * @create: 2020-02-29 13:44
 **/
public class JavaVMStackSOF {
    private int stackLength = 1;
     public void stackLeak(){
         stackLength++;
         stackLeak();
     }

    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }
    }
}
