class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int[] diff=new int[n];

        int pos=(n-1)/2;
        int center=arr[pos];

        for(int i=0;i<n;i++){
            diff[i]=(Math.abs(arr[i]-center));
        }

        int[] res=new int[k];
        int m=0;

        int left=0;
        int right=n-1;
        while(left<=right && m<k){
            if(diff[right]>=diff[left]){
                res[m++]=arr[right];
                right--;
            }else{
                res[m++]=arr[left];
                left++;
            }
        }

        return res;

    }
}
