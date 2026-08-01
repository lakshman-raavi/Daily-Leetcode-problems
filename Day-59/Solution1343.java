class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int total = 0;
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < k; i++) {
            total += arr[i];
        }
        if ((total / k) >= threshold) {
            count++;
        }
        for (int i = k; i < n ; i++) {
            total += arr[i];
            total -= arr[i-k];
            if ((total / k) >= threshold) {
                count++;
            }
        }
        return count;
    }
}
