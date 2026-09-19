class Solution {

    public int funcal(int[] arr,int mid){
        int count=1;
        int last=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=mid){
                count++;
                last=arr[i];
            }
        }

        return count;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low=1;
        int high=price[price.length-1]-price[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(funcal(price,mid)>=k){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }
}
