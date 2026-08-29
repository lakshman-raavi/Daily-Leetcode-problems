class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        int n=nums1.length;
        for(int i=0;i<n;i++){
            set1.add(nums1[i]);
        }

        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        int  count=0;

        int c2=0;

        for(int i=0;i<n;i++){
            int val=nums1[i];
            if(set2.contains(val)){
                count++;
            }
        }

        for(int i=0;i<nums2.length;i++){
            int val=nums2[i];
            if(set1.contains(val)){
                c2++;
            }
        }

        return new int[] { count, c2 };
        
    }
}
