class Solution {

    public void backtrack(int index, String s, List<String> ans,
                          StringBuilder sb, int parts) {

       
        if (parts == 4) {

            if (index == s.length()) {
                ans.add(sb.substring(0, sb.length() - 1));
            }
            return;
        }

        for (int i = index; i < s.length(); i++) {

    
            if (i - index + 1 > 3) {
                break;
            }

            if (isValid(s, index, i)) {

                sb.append(s.substring(index, i + 1));
                sb.append('.');

                backtrack(i + 1, s, ans, sb, parts + 1);

                sb.setLength(sb.length() - (i - index + 1) - 1);
            }
        }
    }

    public boolean isValid(String s, int st, int end) {

        if (st < 0 || end >= s.length() || st > end) {
            return false;
        }

        
        if (s.charAt(st) == '0' && st != end) {
            return false;
        }

        int val = Integer.parseInt(s.substring(st, end + 1));

        return val >= 0 && val <= 255;
    }

    public List<String> restoreIpAddresses(String s) {

        List<String> ans = new ArrayList<>();

        backtrack(
            0,
            s,
            ans,
            new StringBuilder(),
            0
        );

        return ans;
    }
}
