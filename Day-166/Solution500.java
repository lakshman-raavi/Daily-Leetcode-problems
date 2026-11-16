class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> res=new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(words[i].charAt(0));
            int tar = 0;

            if (s1.indexOf(ch) != -1) {
                tar = 1;
            } else if (s2.indexOf(ch) != -1) {
                tar = 2;
            } else {
                tar = 3;
            }

            int original = tar;
            for (int j = 1; j < words[i].length(); j++) {
                char ch2 = Character.toLowerCase(words[i].charAt(j));
                if (s1.indexOf(ch2) != -1) {
                    tar = 1;
                } else if (s2.indexOf(ch2) != -1) {
                    tar = 2;
                } else {
                    tar = 3;
                }

                if(tar!=original){
                    break;
                }
            }

            if(tar==original){
                res.add(words[i]);
            }

        }

        String[] ans=new String[res.size()];

        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }

        return ans;
    }
}
