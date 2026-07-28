class Solution {

    // public int startPov(int[] nums){
    //     int idx=0;
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]>0){
    //             idx=nums[i];
    //             break;
    //         }
    //     }
    //     return idx;
    // }
    public int minStartValue(int[] nums) {
        int minStat=1;
        int n=nums.length;
        int sum=0;

        while(true){
            sum=minStat;
            boolean is=true;
            for(int i=0;i<n;i++){
                sum+=(nums[i]);
                if(sum<=0){
                    is=false;
                    break;
                }
            }
            if(is==false){
                minStat++;
            }
            else{
                break;
            }
        }
        return minStat;
    }
}
