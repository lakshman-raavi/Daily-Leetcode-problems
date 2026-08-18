class Solution {
    public void backtrack(int index, int n, String s, StringBuilder sb, Set<String> ans) {
        if (sb.length() == n) {
            ans.add(sb.toString());
            return;
        }

        char ch = s.charAt(index);

        if (Character.isDigit(ch)) {
            sb.append(ch);
            backtrack(index + 1, n, s, sb, ans);
            sb.setLength(sb.length() - 1);
        } else {
                
                sb.append(Character.toUpperCase(ch));
                backtrack(index + 1, n, s, sb, ans);
                sb.setLength(sb.length() - 1);
            
                sb.append(Character.toLowerCase(ch));
                backtrack(index + 1, n, s, sb, ans);
                sb.setLength(sb.length() - 1);
            
        }

    }

    public List<String> letterCasePermutation(String s) {
        Set<String> ans = new HashSet<>();
        ans.add(s);
        int n = s.length();
        backtrack(0, n, s, new StringBuilder(), ans);
        return new ArrayList<>(ans);
    }
}
