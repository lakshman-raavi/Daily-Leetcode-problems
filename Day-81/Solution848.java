class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();
        long totalShift = 0; 

        
        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]);
            int val = arr[i] - 'a';
            arr[i] = (char) ('a' + (val + totalShift) % 26);
        }

        return new String(arr);
    }
}
