class Solution {
    public String sortVowels(String s) {
        List<Character> capitalOrSmall = new ArrayList<>();

        int k1 = 0;
        int k2 = 0;

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                capitalOrSmall.add(ch);
            }
        }

        Collections.sort(capitalOrSmall);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                sb.append(capitalOrSmall.get(k1++));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}
