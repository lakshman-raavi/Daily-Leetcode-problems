class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res=0;
        int temp=capacity;
        int n=plants.length;
        int completed=0;

        for(int i=0;i<n;i++){
            if(plants[i]<=capacity){
                capacity-=plants[i];
                res++;
            }
            else{
                capacity=temp;
                if(plants[i]<=capacity){
                    capacity-=plants[i];
                }
                res+=(i+(i+1));
            }
        }
        return res;
    }
}
