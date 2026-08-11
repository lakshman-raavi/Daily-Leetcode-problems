class Solution {
    public List<Integer> generateRow(int n){
        List<Integer> rowans=new ArrayList<>();
        long res=1;
        rowans.add((int)res);
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res/=i;
            rowans.add((int)res);
        }
        return rowans;
    }
    public List<Integer> getRow(int rowIndex) {
        return generateRow(rowIndex+1);
    }
}
