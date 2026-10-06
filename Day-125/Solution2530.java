class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            pq.add((long)nums[i]);
        }
        long score = 0;
        while (!pq.isEmpty() && k != 0) {
            score += pq.peek();
            long val = pq.poll();
            pq.add((long)Math.ceil(val / 3.0));
            k--;
        }

        return score;
    }
}
