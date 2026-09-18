class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        // int[] pref=new int[n];

        // pref[0]=nums[0];

        // for(int i=1;i<n;i++){
        //     pref[i]=pref[i-1]+nums[i];
        // }

        Arrays.sort(nums);

        int[] ans=new int[m];

        int k=0;

        for(int i=0;i<m;i++){
            int sum=0;
            int j=0;
            int req=queries[i];
            int len=-1;
            for(j=0;j<n;j++){
                sum+=nums[j];
                if(sum>req){
                    len=j;
                    break;
                }
            }
            if(j==n){
                ans[k++]=n;
            }
            else
            ans[k++]=len;
        }

        return ans;
    }
}
