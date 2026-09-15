class Solution {
    public int[] getBox(int n) {
        int[] prime = new int[n + 1];

        Arrays.fill(prime, 1);
        prime[0] = 0;
        if (n >= 1) {
            prime[1] = 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

        return prime;
    }

    public int[] closestPrimes(int left, int right) {
        int[] prime = getBox(right);

        int[] res = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (prime[i] == 1) {
                list.add(i);
            }
        }

        if (list.size() < 2) {
            return new int[] { -1, -1 };
        } else {
            int diff = list.get(1) - list.get(0);
            res[0] = list.get(0);
            res[1] = list.get(1);
            for (int i = 2; i < list.size(); i++) {
                if (diff > (list.get(i) - list.get(i - 1))) {
                    diff = list.get(i) - list.get(i - 1);
                    res[0] = list.get(i-1);
                    res[1] = list.get(i);
                }
            }
        }

        return res;
    }
}
