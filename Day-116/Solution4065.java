class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] used=new int[n];
        int[] res=new int[n];

        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int val=nums[i];
            for(int j=i+1;j<n;j++){
                if(val!=nums[j] && res[j]==0){
                    res[k++]=val;
                    res[j]=0;
                    val=nums[j];
                }
            }
        }
        res[n-1]=nums[n-1];

        return res;
    }
}
