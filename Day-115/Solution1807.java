class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();

        for(List<String> str: knowledge){
            map.put(str.get(0),str.get(1));
        }

        int i=0;
        StringBuilder res=new StringBuilder();

        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=i+1;
                StringBuilder sb=new StringBuilder();

                while(j<s.length() && s.charAt(j)!=')'){
                    sb.append(s.charAt(j));
                    j++;
                }
                i=j;
                if(map.containsKey(sb.toString())){
                    res.append(map.get(sb.toString()));
                }
                else{
                    res.append('?');
                }
            }
            else{
                res.append(s.charAt(i));
            }
            i++;
        }

        return res.toString();
    }
}
