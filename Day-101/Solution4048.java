class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        int n=nums.length;
        Map<Integer,List<Integer>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=nums[i];
            if(!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(i);
        }
        
        for(Map.Entry<Integer,List<Integer>> e : map.entrySet()){
            boolean is=false;
            int key=e.getKey();
            List<Integer> list=e.getValue();
            int size=list.size();

            if(size>3 || size < 3){
                continue;
            }
            else{
                int diff1=list.get(1)-list.get(0);
                int diff2=list.get(2)-list.get(1);
                if(diff1==diff2){
                    count++;
                }
            }
        }

        return count;
    }
}
