class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int evenc=0;
        int oddc=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenc += (num.charAt(i) - '0');
            }
            else{
                oddc+=(num.charAt(i) - '0');
            }
        }
        return evenc==oddc;
    }
}
