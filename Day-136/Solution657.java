class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int ud=0;
        int lr=0;

        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                ud++;
            }
            else if(ch=='D'){
                ud--;
            }
            else if(ch=='L'){
                lr++;
            }
            else{
                lr--;
            }
        }

        if(lr==0 && ud==0){
            return true;
        }
        // else if((lr==0) && (ud==2 || ud==-2)){
        //     return false;
        // }
        // else if((ud==0) && (lr==2 || lr==-2)){
        //     return false;
        // }
        return false;
    }
}
