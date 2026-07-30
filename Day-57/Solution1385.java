class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1=arr1.length;
        int n2=arr2.length;

        int count=0;

        for(int i=0;i<n1;i++){
            boolean is=true;
            for(int j=0;j<n2;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    is=false;
                    break;
                }
            }
            if(is){
                count++;
            }
        }
        return count;
    }
}
