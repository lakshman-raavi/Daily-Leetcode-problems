class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        int count=0;

        for(int num : nums){
            while(num!=0){
                count++;
                num/=10;
            }
        }
        int k=count-1;
        int[] res=new int[count];
        for(int i=n-1;i>=0;i--){
            int digit=nums[i];

            while(digit!=0){
                res[k]=digit%10;
                k--;
                digit/=10;
            }
        }
        return res;
    }
}
