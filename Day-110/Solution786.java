class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Double, List<Integer>> map = new TreeMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double fraction = (double) arr[i] / arr[j];

                map.put(
                    fraction,
                    new ArrayList<>(Arrays.asList(arr[i], arr[j]))
                );
            }
        }

        for (Map.Entry<Double, List<Integer>> entry : map.entrySet()) {
            k--;

            if (k == 0) {
                List<Integer> list = entry.getValue();
                return new int[]{list.get(0), list.get(1)};
            }
        }

        return new int[0];
    }
}
