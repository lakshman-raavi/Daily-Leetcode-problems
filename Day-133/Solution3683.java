class Solution {
    public int earliestTime(int[][] tasks) {
        
        int res=Integer.MAX_VALUE;
        for(int[] task : tasks){
            int sum=0;
            for(int t : task){
                sum+=t;
            }
            res=Math.min(res,sum);
        }

        return res;
    }
}
