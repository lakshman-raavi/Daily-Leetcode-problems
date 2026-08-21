class Solution {

    public void backtrack(int index,String s,List<List<String>> res,List<String> ds){
        if(index==s.length()){
            res.add(new ArrayList(ds));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                backtrack(i+1,s,res,ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int st,int end){
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        backtrack(0,s,res,new ArrayList<>());
        return res;

    }
}
