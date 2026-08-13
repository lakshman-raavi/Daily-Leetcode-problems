class Solution {

    public int funcal(String s) {
        int n = s.length();
        int res=0;
        for (int i = 1; i < n - 1; i++) {
            int first = s.charAt(i - 1) - '0';
            int mid = s.charAt(i) - '0';
            int second = s.charAt(i + 1) - '0';
            if(first>mid && mid<second){
                res++;
            }
            else if(first<mid && mid>second){
                res++;
            }
        }
        return res;
    }

    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if(i<100){
                continue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            count += (funcal(sb.toString()));
            sb.setLength(0);
        }
        return count;
    }
}
