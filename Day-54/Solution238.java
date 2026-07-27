class Solution {
    // public int leftpord(int[] nums,int k,int n){
    //     int prod=1;
    //     for(int i=k;i<n;i++){
    //         prod*=nums[i];
    //         if(prod==0){
    //             prod=0;
    //             break;
    //         }
    //     }
    //     return prod;
    // }

    // public int rightpord(int[] nums,int k,int n){
    //     int prod=1;
    //     for(int i=k;i<n;i++){
    //         prod*=nums[i];
    //         if(prod==0){
    //             prod=0;
    //             break;
    //         }
    //     }
    //     return prod;
    // }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int[] prefix = new int[n];
        prefix[0] = 1;

        //because we will exclued itself at starting 1
        //else as usewell

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        int[] suffix = new int[n];
        suffix[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}
