class Solution {

    public int sumOfPrimesInRange(int n) {
        int sum = 0;
        int temp = n;
        int res = 0;
        while (temp > 0) {
            int rem = temp % 10;
            res = res * 10 + (rem);
            temp /= 10;
        }
        int max = Math.max(n, res);
        int[] prime = new int[Math.max(n, res) + 1];
        
        Arrays.fill(prime, 1);

        prime[0] = 0;
        if (max >= 1) {
            prime[1] = 0;
        }

        for (int i = 2; i * i <= Math.max(n, res); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= Math.max(n, res); j += i) {
                    prime[j] = 0;
                }
            }
        }

        for (int i = Math.min(n, res); i <= Math.max(n, res); i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
