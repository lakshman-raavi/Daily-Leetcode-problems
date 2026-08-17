class Solution {

    public void backtrack(int start, int n, int sum, int tar, List<String> ans, StringBuilder sb) {
        if (sb.length() == n) {
            if(sum<=tar){
            ans.add(sb.toString());
            }
            return;
        }

        
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '1') {
                sb.append('1');
                backtrack(start+1,n,sum+start,tar,ans,sb);
                sb.setLength(sb.length() - 1);
            }
            sb.append('0');
            backtrack(start+1,n,sum,tar,ans,sb);
            sb.setLength(sb.length() - 1);
        
    }

    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();
        backtrack(0,n,0,k,ans,new StringBuilder());
        return ans;
    }
}
