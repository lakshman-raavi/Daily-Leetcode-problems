class Solution {
    public boolean isVow(char ch){
        return ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u';
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(i>=n/2){
                if(isVow(ch)){
                    count1--;
                }
            }
            else if(isVow(ch)){
                count1++;
            }
        }



        return count1==0;
    }
}
