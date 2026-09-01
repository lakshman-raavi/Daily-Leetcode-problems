class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++){
            int currval=groupSizes[i];

            if(!map.containsKey(currval)){
                map.put(currval,new ArrayList<>());
            }

            map.get(currval).add(i);

            if(map.get(currval).size()==currval){
                res.add(map.get(currval));
                map.put(currval,new ArrayList<>());
            }
        }
        return res;
    }
}
