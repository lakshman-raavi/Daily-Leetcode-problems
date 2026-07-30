class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n2;i++){
            set.add(nums2[i]);
        }
        for(int i=0;i<n1;i++){
            if(set.contains(nums1[i])){
                return nums1[i];
            }
        }
        return -1;
    }
}
