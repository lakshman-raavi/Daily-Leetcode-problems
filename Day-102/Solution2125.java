class Solution {
    public int countOnes(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }

    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int res = 0;

        boolean[] hasDevice=new boolean[n];
        int[] devicecount=new int[n];

        for (int i = 0; i < n; i++) {
            int count1=0;
            if(!bank[i].contains("1")){
                continue;
            }
            else{
                hasDevice[i]=true;
                devicecount[i]=countOnes(bank[i]);
            }
        }
        
        for(int i=0;i<n;i++){
            if(!hasDevice[i]){
                continue;
            }
            int count1=devicecount[i];
            for(int j=i+1;j<n;j++){
                if(!hasDevice[j]){
                    continue;
                }
                else{
                    res+=(devicecount[j]*count1);
                    break;
                }
            }
        }
        
        return res;
    }
}
