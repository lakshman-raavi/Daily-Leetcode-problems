class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res=new ArrayList<>();

        char ch1=s.charAt(0);
        char ch2=s.charAt(3);
        int max=Math.max(s.charAt(1)-'0',s.charAt(4)-'0');
        int min=Math.min(s.charAt(1)-'0',s.charAt(4)-'0');


        for(int i=(int)ch1;i<=(int)ch2;i++){
            for(int j=min;j<=max;j++){
                StringBuilder sb=new StringBuilder();
                sb.append((char)i);
                sb.append(j);
                res.add(sb.toString());
            }
        }

        return res;
    }
}
