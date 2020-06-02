package cn.ascending.ascendingAlgorithm.binary.island;

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
                    dfs(grid,x,y,n,m);
                }
            }
        }
        return ans;
    }

    //把相邻的1全变成0
    private void dfs(char[][] grid,int x,int y,int n,int m){
        if(x<0||y<0||x>=n||y>=m||grid[y][x]=='0') return;
        grid[y][x]='0';
        dfs(grid,x+1,y,n,m);
        dfs(grid,x-1,y,n,m);
        dfs(grid,x,y+1,n,m);
        dfs(grid,x,y-1,n,m);
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

