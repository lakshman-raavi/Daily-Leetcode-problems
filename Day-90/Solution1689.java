class Solution {
    public int minPartitions(String n) {
        int len=n.length();
        int max=Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            int val=n.charAt(i)-'0';
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}
