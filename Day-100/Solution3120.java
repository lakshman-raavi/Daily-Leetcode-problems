class Solution {
    public int numberOfSpecialChars(String word) {

        int count = 0;
        int n = word.length();
        boolean[] used = new boolean[26];

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);

            int value = (int) ch;

            if (value >= 65 && value <= 90) {
                value += 32;
                char c1 = (char) value;

                int index = c1 - 'a';

                if (word.indexOf(c1) != -1 && !used[index]) {
                    count++;
                    used[index] = true;
                }
            }
        }

        return count;
    }
}
