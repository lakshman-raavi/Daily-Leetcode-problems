class Solution {
    public void primebox(int[] prime,int n){
        Arrays.fill(prime,1);
        prime[0]=0;
        if(n>1){
            prime[1]=0;
        }

        for(int i=2;i*i<=n;i++){
            if(prime[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }
        
    }
    public List<Integer> maxPrimes(int n, int s) {
        int[] isPrime=new int[n+1];

        primebox(isPrime,n);

        List<Integer> res=new ArrayList<>();
        long sum=0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]==1){
                sum+=i;
                if(sum<=s){
                res.add(i);
                }
                else{
                    break;
                }
            }
        }
        return res;
    }
}
