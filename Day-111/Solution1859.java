class Solution {
    public String sortSentence(String s) {
        String[] array=s.split(" ");
        int n=array.length;
        String[] res=new String[n];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<array.length;i++){
            String str=array[i];

            char ch=str.charAt(array[i].length()-1);
            res[(ch-'0')-1]=array[i].substring(0,array[i].length()-1);

        }

        for(int i=0;i<n;i++){
            sb.append(res[i]);
            if(i!=n-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
