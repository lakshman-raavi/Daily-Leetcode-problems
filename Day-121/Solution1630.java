class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res=new ArrayList<>();

        int n=nums.length;
        int m=l.length;


        for(int i=0;i<m;i++){
            int st=l[i];
            int end=r[i];
            boolean is=true;
            int[] subArray = Arrays.copyOfRange(nums, st, end+1);

            Arrays.sort(subArray);
            int diff=subArray[1]-subArray[0];
            for(int j=1;j<(end-st+1);j++){
                if(diff!=(subArray[j]-subArray[j-1])){
                    is=false;
                    break;
                }
            }

            if(is==true){
                res.add(true);
            }
            else{
                res.add(false);
            }


        }

        return res;
    }
}
