class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean is=true;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=m-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if((i==0 || j==0) || (i==m-1 && j==0) || (i==0 && j==n-1)){
                    is=true;
                    continue;
                }
                else if(matrix[i-1][j-1]!=matrix[i][j]){
                    return false;
                }
            }
        }
        return is;
    }
}
