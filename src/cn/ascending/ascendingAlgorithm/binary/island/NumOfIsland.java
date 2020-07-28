package cn.ascending.ascendingAlgorithm.binary.island;

//1: island  0: water
public class NumOfIsland {

    private int numlands(char[][] grid){
        int m=grid.length;
        if(m==0) return 0;
        int n=grid[0].length;

        int ans=0;
        for(int y=0;y<m;++y){
            for(int x=0;x<n;++x){
                if(grid[y][x]=='1'){
                    ++ans;
                    dfs(grid,x,y,n,m);//x y 坐标  n:矩阵长度  m:矩阵宽度
                }
            }
        }
        return ans;
    }

    //把已经查到的1全变成0
    private void dfs(char[][] grid,int x,int y,int n,int m){
        if(x<0||y<0||x>=n||y>=m||grid[y][x]=='0') return;
        grid[y][x]=0;
    }

    public static void main(String[] args) {
        char[][] array={
                            {'0','1','1','1','0'},
                            {'1','0','1','0','1'}
                        };
        int answer=new NumOfIsland().numlands(array);
        System.out.println(answer);
    }
}

