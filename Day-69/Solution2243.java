class Solution {
    public String digitSum(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > k) {

            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < sb.length(); i += k) {

                int end = Math.min(i + k, sb.length());

                int sum = 0;

                for (int j = i; j < end; j++) {
                    sum += sb.charAt(j) - '0';
                }

                temp.append(sum);
            }

            sb.setLength(0);
            sb.append(temp);
        }

        return sb.toString();
    }
}
