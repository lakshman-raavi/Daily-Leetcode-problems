class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();

        int n1=words1.length;
        int n2=words2.length;


        for(int i=0;i<n1;i++){
            String str=words1[i];
            map1.put(str,map1.getOrDefault(str,0)+1);
        }

        for(int i=0;i<n2;i++){
            String str=words2[i];
            map2.put(str,map2.getOrDefault(str,0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> e : map1.entrySet() ){
            int val=e.getValue();
            String tar=e.getKey();
            if(val>1){
                continue;
            }
            else if(map2.containsKey(tar)){
                if(map2.get(tar)==1){
                    count++;
                }
            }
        }

        return count;

    }
}
