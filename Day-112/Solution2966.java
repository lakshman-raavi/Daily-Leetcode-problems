class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int size = n / 3;

        int[][] res = new int[size][3];
        for(int i=0;i<n-2;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[][]{};
            }
        }
        int m=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<3;j++){
                res[i][j]=nums[m++];
            }
        }
        return res;

    }
}
