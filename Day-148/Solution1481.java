class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            return a.getValue().compareTo(b.getValue());
        });
        int count=0;
        for(Map.Entry<Integer,Integer> e : list){
            int val=e.getValue();
            if(val<=k){
                k-=val;
                count++;
            }
            else{
                break;
            }
        }


        return map.size()-count;
    }
}
