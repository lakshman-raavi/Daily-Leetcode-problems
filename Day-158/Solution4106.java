class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            int st = i;
            int st1 = i;
            int end = i;

            char prev = s1.charAt(st);

            while (end < n) {
                if (prev != s2.charAt(end)) {
                    end++;
                    st++;
                    if(st<n)
                    prev = s1.charAt(st);

                } else {
                    break;
                }
            }

            if ((end - st1) > 0) {
                String s11 = s1.substring(st1, end );
                String s22 = s2.substring(st1, end );

                List<String> list = new ArrayList<>();
                list.add(s11);
                list.add(s22);
                res.add(list);
            }
            i=end;
        }

        return res;
    }
}
