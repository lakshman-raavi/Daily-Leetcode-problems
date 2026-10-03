class Solution {
    public int countVowels(String s) {
        int count = 0;

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");

        int tar = countVowels(words[0]);

        for (int i = 1; i < words.length; i++) {
            int count = countVowels(words[i]);
            if (count == tar) {
                StringBuilder sb = new StringBuilder(words[i]);
                sb.reverse();
                words[i] = sb.toString();
            }
        }

        String result = String.join(" ", words);

        return result;

    }
}
