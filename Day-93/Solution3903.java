class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pre=new int[n];
        int[] suff=new int[n];

        pre[0]=nums[0];
        int max1=nums[0];

        for(int i=1;i<n;i++){
            if(max1<nums[i]){
                max1=nums[i];
            }
            pre[i]=max1;
        }

        suff[n-1]=nums[n-1];
        int min=nums[n-1];

        for(int i=n-2;i>=0;i--){
            if(min>nums[i]){
                min=nums[i];
            }
            suff[i]=min;
        }

        int indx=-1;
        for(int i=0;i<n;i++){
            int diff=(pre[i]-suff[i]);
            if(diff<=k){
                indx=i;
                break;
            }
        }
        return indx;
    }
}
