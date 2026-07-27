class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length;
        int n1=arr.length;
        int[] res=new int[n];

        int[] prefix=new int[n1+1];
        prefix[0]=0;
        for(int i=1;i<n1+1;i++){
            prefix[i]=prefix[i-1]^arr[i-1];
        }

        for(int i=0;i<n;i++){
            res[i]=prefix[queries[i][1]+1] ^ prefix[queries[i][0]];
        }
        return res;
    }
}
