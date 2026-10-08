class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;

        int n=columnTitle.length();
        int pow=1;
        for(int i=n-1;i>=0;i--){
            char ch=columnTitle.charAt(i);

            int val=(int)(ch-'A');
            val+=1;
            res+=(val*pow);
            pow*=26;
        }

        return res;
    }
}
