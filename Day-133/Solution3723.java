class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();

        long csum=0;

        while(num!=0){
            for(int i=9;i>=0;i--){
                if(csum+i<=sum){
                    csum+=i;
                    sb.append(i);
                    num--;
                    break;
                }
            }
        }
        if(csum==sum)
        return sb.toString();
        return "";
    }
}
