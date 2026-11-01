class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int sum=0;
            int temp=nums[i];
            while(temp!=0){
                sum+=(temp%10);
                temp/=10;
            }
            if(!map.containsKey(sum)){
                map.put(sum,new ArrayList<>());
            }
            map.get(sum).add(nums[i]);
        }

        int max=-1;
        for(Map.Entry<Integer,List<Integer>> e : map.entrySet()){
            List<Integer> list=e.getValue();
            Collections.sort(list);
            int sum=-1;
            if(list.size()>=2){
                sum=list.get(list.size()-1)+list.get(list.size()-2);
            }
            max=Math.max(max,sum);
        }
        return max;

    }
}
