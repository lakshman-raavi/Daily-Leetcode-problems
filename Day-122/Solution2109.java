class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);

        // int n=s.length();
        // int m=spaces.length;
        // int prev=0;
        // for(int i=0;i<m;i++){
        //     sb.insert(spaces[i]+prev," ");
        //     prev++;
        // }
        // return sb.toString();

        char[] result = new char[s.length() + spaces.length];

        int spaceIndex = 0;
        int writeIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result[writeIndex++] = ' ';
                spaceIndex++;
            }

            result[writeIndex++] = s.charAt(i); 
        }

        return new String(result);

    }
}
