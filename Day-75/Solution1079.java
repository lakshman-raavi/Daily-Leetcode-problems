class Solution {

    public int backtrack(int n, StringBuilder sb, Set<String> ans, String tiles, boolean[] used) {

        if (sb.length() > 0) {
            ans.add(sb.toString());

        }

        for (int i = 0; i < n; i++) {

            if (used[i]) {
                continue;
            }

            used[i] = true;

            sb.append(tiles.charAt(i));

            backtrack(n, sb, ans, tiles, used);

            sb.setLength(sb.length() - 1);

            used[i] = false;
        }

        return ans.size();
    }

    public int numTilePossibilities(String tiles) {

        Set<String> ans = new HashSet<>();
        int n = tiles.length();

        boolean[] used = new boolean[n];

        return backtrack(n, new StringBuilder(), ans, tiles, used);
    }
}
