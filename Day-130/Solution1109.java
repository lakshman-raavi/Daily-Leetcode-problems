class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] pref=new int[n];

        int m=bookings.length;
        for(int i=0;i<m;i++){
            int st=bookings[i][0];
            int end=bookings[i][1];
            int val=bookings[i][2];

            pref[st-1]+=val;

            if(end<n){
                pref[end]-=val;
            }
        }
        
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+pref[i];
        }

        return pref;
    }
}
