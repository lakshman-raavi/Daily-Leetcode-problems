class Solution {
    public String fun(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        int n=words.length;


        String[] rev=new String[n];

        for(int i=0;i<n;i++){
            rev[i]=fun(words[i]);
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(rev[j].equals(words[i])){
                    count++;
                }
            }
        }

        return count;
    }
}
