class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = Integer.bitCount(arr[i]);
            if (!map.containsKey(count)) {
                map.put(count, new ArrayList<>());
            }
            map.get(count).add(arr[i]);
        }

        for (List<Integer> list : map.values()) {
            Collections.sort(list);
        }

        int[] temp = new int[n];
        int k = 0;
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            int size = e.getValue().size();
            List<Integer> res=e.getValue();
            int key = e.getKey();

            for (int i = 0; i < size; i++) {
                temp[k] = res.get(i);
                k++;
            }
        }

        return temp;

    }
}
