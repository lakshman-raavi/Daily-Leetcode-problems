class Solution {
    public int findMaxLength(int[] nums) {
        int c1=0;
        int c2=0;
        int length=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }
            else{
                sum--;
            }
            if(map.containsKey(sum)){
                length=Math.max(length,i-map.get(sum));
            }
            else
            map.put(sum,i);
        }
        return length;
    }
}
