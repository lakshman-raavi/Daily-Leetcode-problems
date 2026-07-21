class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        int res=0;
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            product=1;
            for(int j=i;j<n;j++){
                product*=nums[j];
                if(max<product){
                    max=product;
                }
                if(product==0){
                    break;
                }
            }
        }
        return max;
    }
}
