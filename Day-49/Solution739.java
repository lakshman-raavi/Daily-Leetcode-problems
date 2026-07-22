class Solution {

   static class Pair{
        int num;
        int count;
        Pair(int num,int c){
            this.num=num;
            this.count=c;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;

        int[] res=new int[n];

        int count=1;
        Deque<Pair> st=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && st.peek().num<=temperatures[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i]=0;
            }

            else{
                res[i]=st.peek().count-i;
            }
            st.push(new Pair(temperatures[i],i));
        }

        return res;
    }
}
