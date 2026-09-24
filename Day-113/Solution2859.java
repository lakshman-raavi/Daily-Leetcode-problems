class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();

        int sum=0;

        for(int i=0;i<n;i++){
            int count=Integer.bitCount((i));

            if(count==k){
                sum+=nums.get(i);
            }
        }

        return sum;
    }
}
