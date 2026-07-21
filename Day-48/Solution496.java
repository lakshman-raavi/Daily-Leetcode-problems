class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int[] res=new int[nums1.length];
      int n1=nums1.length;
    //   int max=0;
    //   for(int i=0;i<n;i++){
    //     if(i==n-1){
    //         res[n-1]=-1;
    //         continue;
    //     }
    //     for(int j=i+1;j<n;j++){
    //         if(nums2[j]>nums1[i]){
    //             max=nums2[j];
    //             break;
    //         }
    //     }
    //     if(max!=nums1[i]){
    //         res[i]=max;
    //     }
    //     else{
    //         res[i]=-1;
    //     }
    //   }

    int n2=nums2.length;

    for(int i=0;i<n1;i++){
        boolean is=false;
        int idx=-1;
        int max=nums1[i];
        for(int j=0;j<n2;j++){
            if(nums1[i]==nums2[j]){
                is=true;
                idx=j;
                break;
            }
        }

        if(is==true && idx!=-1){
            for(int k=idx+1;k<n2;k++){
                if(nums1[i]<nums2[k]){
                    max=nums2[k];
                    break;
                }
            }
            if(max!=nums1[i]){
                res[i]=max;
            }
            else{
                res[i]=-1;
            }
        }
        else{
            res[i]=-1;
        }
    }
      return res;
    }
}
