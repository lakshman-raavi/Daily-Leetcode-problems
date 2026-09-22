class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");

        int min = -1;

        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit((char) arr[i].charAt(0))) {
                int val = Integer.parseInt(arr[i]);
                if (val > min) {
                    min = val;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}
