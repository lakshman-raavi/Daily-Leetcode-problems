class Solution {
    public String[] createGrid(int m, int n) {
        char[][] mat=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1){
                    mat[i][j]='.';
                }
                else{
                    mat[i][j]='#';
                }
            }
        }
        String[] res=new String[m];
        for(int i=0;i<m;i++){
            res[i]=new String(mat[i]);
        }

        return res;
    }

}
