class Solution {
    public boolean isVow(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ;
    }
    public String trimTrailingVowels(String s) {
        int n=s.length();
        int right=n-1;
        while(right>=0 && isVow(s.charAt(right))){
            right--;
       }
       return s.substring(0,right+1);
    }
}
