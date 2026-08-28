class Solution {
    
    public String funcal(int[] nums,int n,int k,boolean[] used,StringBuilder sb){
        if(sb.length()==n){
            count++;
            if(count==k){
                return sb.toString();
            }
            return "";
        }

        for(int i=0;i<n;i++){
            if(used[i]){
                continue;
            }

            used[i]=true;
            sb.append(nums[i]);
            String res=funcal(nums,n,k,used,sb);
            if(res!=""){
                return res;
            }
            used[i]=false;
            sb.setLength(sb.length()-1);
            
        }

        return "";
    }
    public String getPermutation(int n, int k) {
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        boolean[] used=new boolean[n];
        String res=funcal(nums,n,k,used,new StringBuilder());
        return res;
    }
}
