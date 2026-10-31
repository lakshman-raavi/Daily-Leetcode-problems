class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> set=new HashSet<>();

        int prev=-1;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val=e.getValue();
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }

        return true;
    }
}
