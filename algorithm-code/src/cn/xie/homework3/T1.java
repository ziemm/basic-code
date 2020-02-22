package cn.xie.homework3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.Math.min;
import static sun.swing.MenuItemLayoutHelper.max;

/**
 * @author: xie
 * @create: 2019-12-09 14:19
 **/
public class T1 {
    private static char[][] mp = new char[1004][1004];
    static int n,m,ans =0;
    static int[] dx ={0,1,1,-1};
    static int[] dy ={1,0,-1,0};
    static int gg=0;

    static private Queue<Integer> qx= new LinkedList<>();
    static private Queue<Integer> qy= new LinkedList<>();

    public static void bfs(int a,int b){
        qx.offer(a);
        qy.offer(b);
        int lp =a,rp=b,gt=a,kt=b,g=1;
        mp[a][b]='.';
        while(!qx.isEmpty()){
            int x = qx.element();
            int y = qx.element();
            qx.poll();
            qy.poll();
            for (int i = 0; i < 4; i++) {
                int nowx=x+dx[i];
                int nowy=y=dy[i];
                if(nowx>0&&nowx<=n&&nowy>0&&nowy<=m&&mp[nowx][nowy]=='#'){//广度优先遍历的外加条件：是否是船且是否相互接触
                    qx.offer(nowx);
                    qy.offer(nowy);
                    ++g;
                    mp[nowx][nowy]='.';
                    lp=min(lp,nowx);gt=max(gt,nowx);
                    rp=min(rp,nowy);kt=max(kt,nowy);
                }
            }
        }
        if((gt-lp+1)*(kt-rp+1) !=g) gg=1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m =sc.nextInt();
        //赋值
        for (int i = 1; i <= n; i++) {
            char[] temp = sc.next().toCharArray();
            for (int j = 0; j < temp.length; j++) {
                mp[i][j+1]=temp[j];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=m ; j++) {
                if (mp[i][j]=='#'){
                    gg=0;
                    ++ans;
                    bfs(i,j);
                    if(gg==1){
                        System.out.println("Bad placement.");
                    }
                }
            }
        }
        System.out.println("There are "+ans+" ships");
    }


}
