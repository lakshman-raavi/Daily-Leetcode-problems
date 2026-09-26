class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new LinkedHashMap<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        if(map.size()<k){
            return "";
        }
        String res="";
        for(Map.Entry<String,Integer> e : map.entrySet()){
            
            if(e.getValue()==1){
                k--;
                if(k==0)
                return e.getKey();
            }
            
        }

        return "";
    }
}
