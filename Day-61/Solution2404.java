class Solution {
    public int mostFrequentEven(int[] nums) {
        int count =0;
        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            if(num%2==0)
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int highfreq=0;
        int res=-1;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val=e.getValue();
            int key=e.getKey();
            if(highfreq<val){
                res=key;
                highfreq=val;
            }
        }

        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     int val=e.getValue();
        //     int key=e.getKey();
        //     if(val==highfreq && key%2==0){
        //        return key;
        //     }
        // }
        return res;
    }
}
