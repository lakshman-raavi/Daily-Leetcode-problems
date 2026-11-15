class Solution {
    public int partitionString(String s) {
        List<Character> list=new ArrayList<>();
        int count=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(list.contains(ch)){
                count++;
                list.clear();
            }
            list.add(ch);
        }

        return count+1;
    }
}
