class Solution {
    public int scoreDifference(int[] nums) {
        int n=nums.length;
        int p1=0;
        int p2=0;
        boolean is1=true;
        boolean is2=false;
        int swapc=5;
        for(int i=0;i<n;i++){

            if(i==swapc){
                swapc+=6;
                if(is1==true && nums[i]%2!=0){
                    p1+=nums[i];
                }
                else if(is2==true && nums[i]%2!=0){
                    p2+=nums[i];
                }
                else if(is1==true){
                    is1=false;
                    is2=true;
                    p2+=nums[i];
                }
                else{
                    is2=false;
                    is1=true;
                    p1+=nums[i];
                }
               
            }
            else{
            if(nums[i]%2==0){
                if(is1==true){
                    p1+=nums[i];
                }
                else{
                    p2+=nums[i];
                }
            }
            else{
                if(is1==true){
                    is1=false;
                    is2=true;
                    p2+=nums[i];
                }
                else{
                    is2=false;
                    is1=true;
                    p1+=nums[i];
                }
            }
            }
        }

        return p1-p2;
    }
}
