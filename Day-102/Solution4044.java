class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int count=0;
        
        long leftsum=0;
        long rightsum=0;
        for(int i=0;i<n/2;i++){
            leftsum+=nums[i];
        }

        for(int i=n/2;i<n;i++){
            rightsum+=nums[i];
        }

        if(leftsum>rightsum){
            count++;
        }

        int left=n/2;
        int right=n;
        int kleft=0;
        int kright=n/2;
        while(right<(2*n)-1){
            leftsum+=nums[left%n];
            leftsum-=nums[kleft%n];
            kleft++;
            rightsum+=nums[right%n];
            rightsum-=nums[kright%n];
            kright++;
            right++;
            left++;
            if(leftsum>rightsum){
                count++;
            }
        }

        return count;
        
    }
}
