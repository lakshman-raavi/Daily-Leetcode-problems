class Solution {
    public int countKeyChanges(String s) {
        int n=s.length();
        int count=0;
        char prev=Character.toLowerCase(s.charAt(0));

        for(int i=1;i<n;i++){
            char curr=Character.toLowerCase(s.charAt(i));
            if(curr!=prev){
                count++;
            }

            prev=curr;
        }

        return count;
    }
}
