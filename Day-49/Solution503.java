class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        int[] res=new int[n];

        // for(int i=0;i<n;i++){
        //     res[i]=-1;
        //     for(int j=i+1;j<=(i+n-1);j++){
        //         int idx=j%n;
        //         if(nums[idx]>nums[i]){
        //             res[i]=nums[idx];
        //             break;
        //         }
        //     }
        // }

        Deque<Integer> stack=new ArrayDeque<>();

        for(int i=2*n-1;i>=0;i--){
            
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                stack.pop();
            }

            if(i<n){
            if(stack.isEmpty()){
                res[i]=-1;
            }

            else{
                res[i]=stack.peek();
            }
            }
            stack.push(nums[i%n]);
        }
        return res;
    }
}
