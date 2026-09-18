class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int n=name.length();
        int m=typed.length();

        while(i<n && j<m){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else{
                if(i>0 && name.charAt(i-1)==typed.charAt(j))
                j++;
                else{
                    return false;
                }
            }
        }


        StringBuilder sb=new StringBuilder(typed.substring(j));
        if(sb.length()==0){
            return i==n;
        }
        else{
            char ch=name.charAt(i-1);
            for(int k=0;k<sb.length();k++){
                if(sb.charAt(k)!=ch){
                    return false;
                }
            }
        }

        return i==n ;
    }
}
