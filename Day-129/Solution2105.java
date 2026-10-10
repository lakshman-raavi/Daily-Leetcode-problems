class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int res=0;
        int n=plants.length;
        int t1=capacityA;
        int t2=capacityB;
        int left=0;
        int right=n-1;
        while(left<right){
            if(plants[left]<=capacityA){
                capacityA-=plants[left];
            }
            else{
                capacityA=t1;
                capacityA-=plants[left];
                res++;
            }
            if(plants[right]<=capacityB){
                capacityB-=plants[right];
            }
            else{
                capacityB=t2;
                capacityB-=plants[right];
                res++;
            }
            left++;
            right--;
        }
        if(left==right){
            int max=Math.max(capacityA,capacityB);
            if(plants[left]>max){
                res++;
            }
        }

        return res;
    }
}
