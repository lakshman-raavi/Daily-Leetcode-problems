class Solution {
    public int passwordStrength(String password) {
        Set<Character> set=new HashSet<>();
        int n=password.length();
        int total=0;
        for(int i=0;i<n;i++){
            if(set.contains(password.charAt(i))){
                continue;
            }
            set.add(password.charAt(i));
            int ch=password.charAt(i);
            if(ch>=65 && ch<=90){
                total+=2;
            }
            else if(ch>=97 && ch<=122){
                total+=1;
            }
            else if(ch>=48 && ch<=57){
                total+=3;
            }
            else{
                total+=5;
            }
        }
        return total;
    }
}
