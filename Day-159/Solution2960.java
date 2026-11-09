class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int res=0;
        int n=batteryPercentages.length;

        for(int i=0;i<n;i++){
            if(batteryPercentages[i]>0){
                res++;
            }
            else{
                continue;
            }
            for(int j=i+1;j<n;j++){
                batteryPercentages[j]=Math.max(0,batteryPercentages[j]-1);
            }
        }

        return res;
    }
}
