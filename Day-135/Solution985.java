class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;

        int m = queries.length;
        int[] res = new int[m];

        int evensum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                evensum += nums[i];
            }
        }

        int k = 0;
        for (int i = 0; i < m; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];

            if ((nums[idx] + val) % 2 == 0) {
                if(nums[idx]%2==0){
                    evensum+=val;
                }
                else{
                evensum += (nums[idx]+val);
                }
            }
            else{
                if(nums[idx]%2==0){
                    evensum-=nums[idx];
                }
            }

            nums[idx] += val;
            res[k++] = evensum;

        }
        return res;
    }
}
