class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count=0;
        if( intervals==null || intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        // int[][] res=new int[n][2];

        // res[0]=intervals[0];
        // int e=0;
        // for(int i=1;i<n;i++){
        //     if(res[e][1]>=intervals[i][0]){
        //         res[e][1]=Math.max(res[e][1],intervals[i][1]);
        //         count++;
        //     }
        //     else{
        //         e++;
        //         res[e]=intervals[i];
        //     }
        // }


        for(int i=0;i<n-1;i++){
            int val1=intervals[i][0];
            int val2=intervals[i][1];

            for(int j=i+1;j<n;j++){
                int val3=intervals[j][0];
                int val4=intervals[j][1];

                if(val1<=val3 && val3<=val2){
                    count++;
                }
            }
        }

        return count;
    }
}
