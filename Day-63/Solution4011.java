class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;

        int res=0;
        for(int i=0;i<n;i++){
            int x=0;
            int y=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    x++;
                }
                else{
                    y++;
                }

                if(y>0){
                    if(x*b<=y*a){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
