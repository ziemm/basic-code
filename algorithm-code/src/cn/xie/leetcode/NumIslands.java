package cn.xie.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. 岛屿数量
 * @author: xie
 * @create: 2020-11-02 19:55
 **/
public class NumIslands {
    /*图的遍历，深度优先搜索，进行几次深度优先搜索就说明有几个岛屿*/
    public int numIslands(char[][] grid) {
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        //退出递归的边界条件
        if(i<0 || j<0 ||j>grid[0].length-1 ||i>grid.length-1 || grid[i][j]=='0')
            return;
        grid[i][j]='0';//已经访问过的需要消除
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }

    /*图的广度优先遍历，使用辅助的数据结构list*/
    public int numIslands1(char[][] grid) {
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 广度优先
     * @param grid
     * @param i
     * @param j
     */
    private void bfs(char[][] grid, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        while (!queue.isEmpty()){
            int[] cur = queue.poll();
            i=cur[0];
            j=cur[1];
            if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1'){
                grid[i][j]='0';
                queue.add(new int[]{i-1,j});
                queue.add(new int[]{i+1,j});
                queue.add(new int[]{i,j-1});
                queue.add(new int[]{i,j+1});
            }
        }
    }

}
