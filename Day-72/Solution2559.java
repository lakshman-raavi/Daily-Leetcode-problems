class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int m = queries.length;
        int[] res = new int[m];
        int[] prefix = new int[n];
        for (int i = 0; i < n; i++) {
            if (words[i].length() > 0) {
                char first = (words[i].charAt(0));
                char last = (words[i].charAt(words[i].length() - 1));

                if ("aeiou".indexOf(first) != -1 && "aeiou".indexOf(last) != -1) {
                    prefix[i] = 1;
                } else {
                    prefix[i] = 0;
                }
            }
        }

        int[] prefixsum = new int[n];
        prefixsum[0] = prefix[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + prefix[i];
        }

        for (int i = 0; i < m; i++) {
            if (queries[i][0] == queries[i][1]) {
                if (prefix[queries[i][0]] != 0) {
                    res[i] = 1;
                }
            } else {
                int r = queries[i][1];
                int l = queries[i][0];
                if (l == 0) {
                    res[i] = prefixsum[r];
                } else
                    res[i] = prefixsum[r] - prefixsum[l - 1];
            }
        }
        return res;
    }
}
