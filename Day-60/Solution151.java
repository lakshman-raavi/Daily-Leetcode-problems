class Solution {
    public String reversefun(String s) {
        if (s == null)
            return null;
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseWords(String s) {
        // StringBuilder sb = new StringBuilder();
        // String str = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     if (s.charAt(i) == ' ' || i==0) {
        //         if (!str.equals(' ')) {
        //             sb.append((reversefun(str)) + ' ');
        //             str = "";
        //         }
        //         continue;
        //     } else {
        //         str += s.charAt(i);
        //     }

        // }
        
        //     if (sb.length() > 0 && sb.charAt(0) == ' ') {
        //         sb.deleteCharAt(0);
        //     }
        //     if(sb.length() > 0 && sb.charAt(sb.length()-1)==' '){
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        // return sb.toString();



       
       String[] words = s.trim().split("\\s+");
       int n=words.length;
       StringBuilder sb=new StringBuilder();

       for(int i=n-1;i>=0;i--){
        sb.append(words[i]);
        if(i!=0){
            sb.append(' ');
        }
       }
       return sb.toString();
    }
}
