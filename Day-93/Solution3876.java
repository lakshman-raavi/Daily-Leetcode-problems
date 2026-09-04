class Solution {
    public boolean uniformArray(int[] nums1) {

        // int oddc = 0;
        // int evenc = 0;
        int n = nums1.length;

        // for (int i = 0; i < n; i++) {
        //     if (nums1[i] % 2 == 0) {
        //         evenc++;
        //     } else {
        //         oddc++;
        //     }
        // }

        // if (evenc == n || oddc == n) {
        //     return true;
        // }

        int mineven = Integer.MAX_VALUE;
        int minodd = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                if (nums1[i] < mineven) {
                    mineven = nums1[i];
                }
            } else {
                if (nums1[i] < minodd) {
                    minodd = nums1[i];
                }
            }
        }

        int res=Math.min(minodd,mineven);
        boolean iseven=false;
        if(res%2==0){
            iseven=true;
        }
        for(int i=0;i<n;i++){
            if(nums1[i]==res){
                continue;
            }
            if(iseven==true){
                if(nums1[i]%2==0){
                    continue;
                }
                int val=nums1[i]-res;
                if(val%2!=0){
                    return false;
                }
            }
            else{
                if(nums1[i]%2!=0){
                    continue;
                }
                int val=nums1[i]-res;
                
                if(val%2==0){
                    return false;
                }
            }
        }

        return true;

    }
}
