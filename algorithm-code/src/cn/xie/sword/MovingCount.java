package cn.xie.sword;

/**
 * 面试题13 机器人的运动范围  利用回溯法 dfs
 * @author: xie
 * @create: 2020-03-20 22:54
 **/
public class MovingCount {

    //访问标志数组
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        if(k<=0||n<=0||m<0)
            return 0;
        visited = new boolean[m][n];
        return dfs(0,0,m,n,k,visited);

    }

    public int dfs(int row,int col,int m,int n,int k,boolean[][] visited){
        if(row<0||row>=m||col<0||col>=n||getNum(row,col)>k||visited[row][col])
            return 0;
        visited[row][col]=true;
        return 1+dfs(row-1,col,m,n,k,visited)//上
                +dfs(row+1,col,m,n,k,visited)//下
                +dfs(row,col-1,m,n,k,visited)//左
                +dfs(row,col+1,m,n,k,visited);//右

    }
    private int getNum(int row,int col){
        return row/10+row%10+col/10+col%10;
    }
}
