class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        int n=date.length();
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))) + "-");
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))) + "-");
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(8))));
        return sb.toString();
    }
}
