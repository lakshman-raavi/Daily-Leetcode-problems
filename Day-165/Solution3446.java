class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!map.containsKey((i - j))) {
                    map.put((i - j), new ArrayList<>());
                }
                map.get((i - j)).add(grid[i][j]);
            }
        }

        for (int d : map.keySet()) {
            List<Integer> list = map.get(d);

            if (d >= 0) {
                list.sort(Collections.reverseOrder());
            } else {
                Collections.sort(list);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                grid[i][j] = map.get(i - j).get(0);
                map.get(i - j).remove(0);

            }
        }

        return grid;
    }
}
