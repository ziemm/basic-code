package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-20 10:53
 **/
public class Meituan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int addScore = sc.nextInt();
        int subScore = sc.nextInt();
        sc.nextLine();
        char[][] map = new char[row][col];
        int x =0;
        int y = 0;
        for (int i = 0; i < row; i++) {
            map[i] = sc.nextLine().toCharArray();
            for (int j = 0; j < col; j++) {
                if(map[i][j]=='S'){
                    x=i;
                    y=j;
                }
            }
        }
        String str = sc.nextLine();
        System.out.println(judge(map,str,x,y,addScore,subScore));
    }
    public static int judge(char[][] map,String str,int x,int y,int addScore,int subScore){
        int row = map.length;
        int col = map[0].length;
        int res =0;
        for (char c : str.toCharArray()) {
            if(c=='W'){
                x -= 1;
                if(x<0 || map[x][y]=='#')
                    x++;
            }
            else if(c=='A'){
                y -= 1;
                if(y<0 || map[x][y]=='#')
                    y++;
            }
            else if(c=='D'){
                y += 1;
                if(y>= col || map[x][y]=='#')
                    y--;
            }
            else if(c=='S'){
                x  += 1;
                if(x>=row || map[x][y]=='#')
                    x--;
            }

            if(map[x][y]=='O'){
                res += addScore;
                map[x][y] = '+';
            }
            if(map[x][y]=='X'){
                res -= subScore;
                map[x][y] = '+';
            }
        }
        return res;
    }
}
