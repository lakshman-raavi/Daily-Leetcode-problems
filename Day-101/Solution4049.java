class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int count=0;
        Map<Integer,List<Integer>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=nums[i];
            if(!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(i);
        }

        for(Map.Entry<Integer,List<Integer>> e : map.entrySet()){
            int key=e.getKey();
            List<Integer> list=e.getValue();
            int size=list.size();
            if(size<3){
                continue;
            }
            else{
                int tar=list.get(1)-list.get(0);
                boolean is=true;
                for(int i=1;i<list.size();i++){
                    if(list.get(i)-list.get(i-1)!=tar){
                        is=false;
                        break;
                    }
                }
                if(is==true){
                    count++;
                }
            }
        }
        return count;
    }
}
