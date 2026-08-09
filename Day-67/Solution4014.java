class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double min = 0;

        int i = prices.length - 1;
        int j = discounts.length - 1;

        while (i >= 0 && j >= 0) {
            double dis = (prices[i] * (100 - discounts[j])) / 100.0;
            min += dis;

            i--;
            j--;
        }

        while(i>=0){
            min+=prices[i];
            i--;
        }

        return min;
    }
}
