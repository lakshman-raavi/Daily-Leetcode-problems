class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>();
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            map.put(heights[i],names[i]);
        }

        String[] res=new String[map.size()];
        int k=0;
        for(Map.Entry<Integer,String> e : map.entrySet()){
            res[k++]=e.getValue();
        }

        for(int i=0;i<map.size()/2;i++){
            String temp=res[i];
            res[i]=res[map.size()-i-1];
            res[map.size()-i-1]=temp;

        }

        

        return res;
    }
}
