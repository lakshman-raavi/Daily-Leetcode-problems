class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(Integer.parseInt(details[i].substring(11,13))>60){
                count++;
            }
        }
        return count;
    }
}
