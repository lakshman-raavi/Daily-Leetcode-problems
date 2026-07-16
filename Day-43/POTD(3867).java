class Solution {
    public int gcd(int a ,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] mx=new int[n];
        mx[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                mx[i]=nums[i];
                max=nums[i];
            }
            else{
                mx[i]=max;
            }
        }
        int[] prefixGcd=new int[n];
        for(int i=0;i<n;i++){
            prefixGcd[i]=gcd(nums[i],mx[i]);
        }

        Arrays.sort(prefixGcd);

        long sum=0;

        for(int i=0;i<n/2;i++){
            int first=prefixGcd[i];
            int last=prefixGcd[n-i-1];
            sum+=gcd(first,last);
        }
        return sum;

        
    }
}
