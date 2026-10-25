class Solution {
    public int calculateScore(int a, int b) {
        int c1=0;
        int c2=0;
        for(int i=0;i<31;i++){
            if((a&(1<<i))!=0){
                c1++;
            }
            if((b&(1<<i))!=0){
                c2++;
            }
        }

        if(c1>=c2)
        return c1*c2;

        return c2/c1;
    }
}
