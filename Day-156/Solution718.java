class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        int[] prev=new int[n1+1];
        int[] curr=new int[n1+1];
        int max=0;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(nums1[i-1]==nums2[j-1]){
                    curr[j]=1+prev[j-1];
                    max=Math.max(max,curr[j]);
                }
                else{
                    curr[j]=0;
                }
            }
            int[] temp=curr;
            curr=prev;
            prev=temp;
        }

        return max;

    }
}
