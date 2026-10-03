class Solution {
    public boolean hasValidPath(char[][] grid) {
     int m=grid.length,n=grid[0].length;
     if(grid[0][0] != '(' || grid [m-1][n-1] != ')') return false;
     return dfs(grid,0,0,0);
    }
    boolean dfs(char[][] g,int i,int j,int b){
        b+=g[i][j]=='('? 1:-1;
        if(b<0) return false;
        if(i==g.length-1 && j==g[0].length-1) return b==0;
        if(i+1<g.length && dfs(g,i+1,j,b))  return true;
        return j+1<g[0].length && dfs(g,i,j+1,b);   
    }
}