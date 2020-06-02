package cn.ascending.ascendingAlgorithm.binary.island;

/*
*   用DFS算法实现每个区域的面积，这里利用递归实现，计算过的陆地则变为0；
    遍历图中所有的元素，记录当前最大的面积
* */
public class MaxNumOfIsland {
    private int maxAreaOfLand(int[][] grid){
        int maxArea=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]!=0){
                    maxArea=Math.max(maxArea,areaOfIsLand(grid,i,j));
                }
            }
        }
        return maxArea;
    }

    private int areaOfIsLand(int[][]grid,int i,int j){
        int len=grid[0].length;
        if(i>=0&&i<grid.length&&j>=0&&j<len&&grid[i][j]!=0){
            grid[i][j]=0;
            return 1+areaOfIsLand(grid,i+1,j)+areaOfIsLand(grid,i-1,j)+areaOfIsLand(grid,i,j+1)+areaOfIsLand(grid,i,j-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] array={
                {0,1,1,1,0},
                {1,0,1,0,1}
        };
        int answer=new MaxNumOfIsland().maxAreaOfLand(array);
        System.out.println(answer);
    }
}
