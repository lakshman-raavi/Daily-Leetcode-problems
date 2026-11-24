class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        List<Integer> list=new ArrayList<>(set);
        int[] res=new int[Math.min(list.size(),k)];
        int m=0;
        for(int i=list.size()-1;i>=0 && k!=0 ;i--){
            res[m]=list.get(i);
            m++;
            k--;
        }

        return res;

        
    }
}
