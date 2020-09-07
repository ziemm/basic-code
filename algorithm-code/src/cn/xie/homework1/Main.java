package cn.xie.homework1;

import cn.xie.TreeNode;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        sc.nextLine();
        char[] jsb = new char[4*v];
        for (int i = 0; i < jsb.length; i++) {
            String s = sc.next();
            char[] chars = s.toCharArray();
            jsb[i] =chars[0];
        }

        for (int i = 0; i < jsb.length; i += 4) {
            char left = jsb[i];
            char right= jsb[i+1];
            char bLeft = jsb[i+2];
            char bRight = jsb[i+3];
            judge(left,right,bLeft,bRight);
        }
    }

    private static void judge(char left, char right, char bLeft, char bRight) {
        int lw =0;
        if(left=='J'){//剪刀
            if(bLeft=='B' && bRight=='B')lw=2;
            else if(bLeft=='B' && bRight!='S')lw=1;
            else if(bLeft!='B' && bRight=='B')lw=1;
            else lw =0;
        }else if(left=='S'){//石头
            if(bLeft=='J' && bRight=='J')lw=2;
            else if(bLeft=='J' && bRight!='J')lw=1;
            else if(bLeft!='J' && bRight=='J')lw=1;
            else lw =0;
        }else if(left=='B'){//布
            if(bLeft=='S' && bRight=='S')lw=2;
            else if(bLeft=='S' && bRight!='S')lw=1;
            else if(bLeft!='S' && bRight=='B')lw=1;
            else lw =0;
        }

        //右手
        int rw = 0;
        if(right=='J'){//剪刀
            if(bLeft=='B' && bRight=='B')rw=2;
            else if(bLeft=='B' && bRight!='B')rw=1;
            else if(bLeft!='B' && bRight=='B')rw=1;
            else rw =0;
        }else if(right=='S'){//石头
            if(bLeft=='J' && bRight=='J')rw=2;
            else if(bLeft=='J' && bRight!='J')rw=1;
            else if(bLeft!='J' && bRight=='J')rw=1;
            else rw =0;
        }else if(right=='B'){//布
            if(bLeft=='S' && bRight=='S')rw=2;
            else if(bLeft=='S' && bRight!='S')rw=1;
            else if(bLeft!='S' && bRight=='S')rw=1;
            else rw =0;
        }

        if(lw>rw){
            System.out.println("left");
        }else if(lw==rw){
            System.out.println("same");
        }else {
            System.out.println("right");
        }
    }
}
