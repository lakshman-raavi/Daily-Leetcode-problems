class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }

        boolean is1 = false;
        boolean is2 = true;

        n -= 10;
        int turn=1;

        int req = 9;
        int temp = n;
        while (temp > 0) {
            if(n>=req){
                n-=req;
                turn++;
            }
            else{
                return turn%2!=0;
            }

            temp = n;
            req--;
        }

        return turn%2!=0;
    }
}
