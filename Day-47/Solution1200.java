class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        int mindiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            int diff = arr[i] - arr[i - 1];

            if (diff < mindiff) {
                mindiff = diff;
                res.clear();

                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                res.add(pair);

            } else if (diff == mindiff) {

                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }

        return res;
    }
}
