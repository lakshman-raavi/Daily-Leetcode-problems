class Solution {

    int count = 0;

    public String funcal(StringBuilder sb, int n, int k) {

        if (sb.length() == n) {
            count++;

            if (count == k) {
                return sb.toString();
            }

            return "";
        }

        for (char ch = 'a'; ch <= 'c'; ch++) {

            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {

                sb.append(ch);

                String res = funcal(sb, n, k);

                if (res != "") {
                    return res;
                }

                sb.setLength(sb.length() - 1);
            }
        }

        return "";
    }

    public String getHappyString(int n, int k) {
        
        if(n==1 && k>3){
            return "";
        }
        count = 0;

        return funcal(new StringBuilder(), n, k);
    }
}
