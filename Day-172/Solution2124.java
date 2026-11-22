class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        char prev=s.charAt(0);
        int count=0;
        for(int i=1;i<n;i++){
            char ch=s.charAt(i);
            if(prev==ch){
                continue;
            }
            else if(prev=='a' && ch=='b'){
                count++;
            }
            else{
                return false;
            }
        prev=ch;
        }

        return true;
    }
}
