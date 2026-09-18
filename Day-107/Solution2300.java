class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] res = new int[n];
        int m = potions.length;
        Arrays.sort(potions);
        int k = 0;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int low = 0;
            int high = m - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if((long) spells[i] * potions[mid] >= success){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            res[i]=m-low;

        }
        return res;

    }
}
