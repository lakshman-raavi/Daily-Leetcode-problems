class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int[] suff=new int[n];
        suff[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],height[i]);
        }

        int prev=height[0];

        int res=0;

        for(int i=0;i<n;i++){

            prev=Math.max(prev,height[i]);
            res+=(Math.min(prev,suff[i])-height[i]);
        }

        return res;
    }
}
