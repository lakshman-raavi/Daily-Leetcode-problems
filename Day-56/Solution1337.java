class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        Map<Integer,Integer> map=new HashMap<>();

        int[] ans=new int[k];
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    sum++;
                }
            }
            map.put(i,sum);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((a,b)->a.getValue().compareTo(b.getValue()));
        int l=0;
        for(Map.Entry<Integer,Integer> e : list){
            ans[l]=e.getKey();
            l++;
            if(l==k){
                break;
            }
        }

        return ans;
    }
}
