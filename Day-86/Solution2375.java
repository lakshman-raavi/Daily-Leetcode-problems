class Solution {
    public String funcal(int index, String s, StringBuilder sb,int n, boolean[] used) {

        if (index == n) {
            if (sb.length() == n + 1) {
                return sb.toString();
            }
            return "";
        }

        for (int i = 0; i < 9; i++) {

            if (used[i]) {
                continue;
            }

            int curr = i + 1;

            if (s.charAt(index) == 'I') {

                if (sb.length() == 0 ||
                        sb.charAt(sb.length() - 1) - '0' < curr) {

                    used[i] = true;
                    sb.append(curr);

                    String res = funcal(index + 1, s, sb, n, used);

                    if (!res.equals("")) {
                        return res;
                    }

                    sb.setLength(sb.length() - 1);
                    used[i] = false;
                }

            } else {

                if (sb.length() == 0 ||
                        sb.charAt(sb.length() - 1) - '0' > curr) {

                    used[i] = true;
                    sb.append(curr);

                    String res = funcal(index + 1, s, sb, n, used);

                    if (!res.equals("")) {
                        return res;
                    }

                    sb.setLength(sb.length() - 1);
                    used[i] = false;
                }
            }
        }

        return "";
    }

     public String smallestNumber(String pattern) {

        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[9];

        int n = pattern.length();

        // Need n + 1 digits
        // First digit has no pattern comparison
        for (int i = 0; i < 9; i++) {

            used[i] = true;
            sb.append(i + 1);

            String res = funcal(0, pattern, sb, n, used);

            if (!res.equals("")) {
                return res;
            }

            sb.setLength(0);
            used[i] = false;
        }

        return "";
    }
}
