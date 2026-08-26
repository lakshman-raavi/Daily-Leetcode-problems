class Solution {
    public String truncateSentence(String s, int k) {
        // String[] res=s.split("\\s+");
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<k;i++){
        //     sb.append(res[i]);
        //     if(i!=k-1){
        //         sb.append(" ");
        //     }
        // }

        // return sb.toString();

        int n=s.length();

        StringBuilder sb=new StringBuilder();

    int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                count++;
            }

            if(count==k){
                return s.substring(0,i);
            }
        }
        return s;
    }
}
