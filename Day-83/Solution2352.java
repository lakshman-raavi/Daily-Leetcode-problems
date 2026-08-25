class Solution {
    public int equalPairs(int[][] grid) {
       Map<List<Integer>, Integer> map = new HashMap<>();
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            List<Integer> res=new ArrayList<>();
            for(int j=0;j<m;j++){
                res.add(grid[i][j]);
            }
            map.put(res,map.getOrDefault(res,0)+1);
        }


        for(int j=0;j<m;j++){
            List<Integer> res=new ArrayList<>();
            for(int i=0;i<n;i++){
                res.add(grid[i][j]);
            }
            if(map.containsKey(res)){
                count+=map.get(res);
            }
        }

        return count;
    }
}
