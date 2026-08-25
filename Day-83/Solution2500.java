class Solution {
    public void sortRow(int[] matrix){
        Arrays.sort(matrix); 
    }
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            sortRow(grid[i]);
        }
        
        
        
        int sum=0;
        for(int j=0;j<m;j++){
            int m1=0;
            for(int k=0;k<n;k++){
                if(m1<grid[k][j]){
                    m1=grid[k][j];
                }
            }
            sum+=m1;
            
        }
        return sum;
    }
}
