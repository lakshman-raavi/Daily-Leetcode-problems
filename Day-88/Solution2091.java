class Solution {
    public int minimumDeletions(int[] nums) {
        int index1=-1;
        int index2=-1;

        int n=nums.length;
        
        if(n==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                max=nums[i];
                index1=i+1;
            }
            if(nums[i]<=min){
                min=nums[i];
                index2=i+1;
            }
        }

        int temptotal=n+1;

        int count1=0;
        count1+=Math.min(index1,Math.abs(temptotal-index1));
        count1+=Math.min(index2,Math.abs(temptotal-index2));

        int frontc=0;
        frontc+=(Math.max(index1,index2));
        int backc=0;
        backc+=Math.max((temptotal-index1),(temptotal-index2));
        return Math.min(count1,Math.min(frontc,backc));
    }
}
