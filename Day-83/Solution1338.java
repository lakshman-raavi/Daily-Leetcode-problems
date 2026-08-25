class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            int cmp = b.getValue().compareTo(a.getValue());

            if (cmp == 0) {
                return b.getKey().compareTo(a.getKey());
            }

            return cmp;
        });
        int half=n/2;
        int count=0;
        int res=0;
        for(int i=0;i<list.size();i++){
            count=count+list.get(i).getValue();
            res++;
            if(count>=half){
                break;
            }
            
        }
        return res;

    }
}
