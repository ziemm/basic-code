package cn.xie.sword;

/**
 * 面试题12矩阵中的路径  回溯
 * @author: xie
 * @create: 2020-03-10 14:54
 **/
public class Exist {
    int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}}; //方向索引
    boolean[][] visited;//访问标志数组

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if(board[i][j]==word.charAt(0)&&!visited[i][j]){
                   visited[i][j] = true;
                   if(existCore(board,word,i,j,1)){
                       return true;
                   }
                   //试探不成功，该点未被访问
                   visited[i][j]= false;
               }
            }
        }
        return false;
    }

    public boolean existCore(char[][] board,String word,int row,int col,int index){
        if(word.length()==index)//当索引的线长度与word长度相等则找到
            return true;
        //试探
        for (int i = 0; i < 4; i++) {
            int x = row+dir[i][0];
            int y = col+dir[i][1];
            if (x>=0&&x<board.length&&y>=0&&y<board[0].length){
                if(board[x][y]==word.charAt(index)&&!visited[x][y]){
                    visited[x][y]=true;
                    if(existCore(board,word,x,y,index+1)){
                        return true;
                    }
                   //如果试探不成功
                    visited[x][y]=false;
                }
            }
        }
        return false;
    }

}
