class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            int cmp=a.getValue().compareTo(b.getValue());
            if(cmp==0){
                return b.getKey().compareTo(a.getKey());
            }
            return cmp;
        });
        int[] res=new int[n];
        int k=0;
        for(Map.Entry<Integer,Integer> e : list){
            int key=e.getKey();
            int val=e.getValue();
            for(int i=0;i<val;i++){
                res[k]=key;
                k++;
            }
        }
        return res;
    }
}
