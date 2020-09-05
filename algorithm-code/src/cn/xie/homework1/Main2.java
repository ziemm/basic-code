package cn.xie.homework1;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-23 16:25
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] path = str.toCharArray();
        boolean run = run(path);
        if(run){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

    public static boolean run(char[] path){
        boolean[][] board = new boolean[10000][10000];
        int row =5000;
        int col =5000;
        board[row][col] = true;
        for (int i = 0; i < path.length; i++) {
               if('N'==path[i]){
                   row--;
                   if(board[row][col]==true){
                       return true;
                   }
                   board[row][col]=true;
               }else if('S'==path[i]){
                   row++;
                   if(board[row][col]==true){
                       return true;
                   }
                   board[row][col]=true;
               }else if('E'==path[i]){
                   col++;
                   if(board[row][col]==true){
                       return true;
                   }
                   board[row][col]=true;
               }else if('W'==path[i]){
                   col--;
                   if(board[row][col]==true){
                       return true;
                   }
                   board[row][col]=true;
               }
        }
        return false;
    }
}
