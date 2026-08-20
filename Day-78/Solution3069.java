class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1=new ArrayList<>();

        List<Integer> list2=new ArrayList<>();

        int n=nums.length;

        if(n==2){
            return nums;
        }
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<n;i++){
            
            if(list2.get(list2.size()-1)<list1.get(list1.size()-1)){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
            
        }

        int[] res=new int[n];
        int k=0;
        for(int i : list1){
            res[k]=i;
            k++;
        }

        for(int i : list2){
            res[k]=i;
            k++;
        }

        return res;
    }
}
