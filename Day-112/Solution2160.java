class Solution {
    public int minimumSum(int num) {
        int min=Integer.MAX_VALUE;

        int[] arr=new int[4];
        int k=0;

        String str=String.valueOf(num);

        arr[0]=str.charAt(0)-'0';
        arr[1]=str.charAt(1)-'0';
        arr[2]=str.charAt(2)-'0';
        arr[3]=str.charAt(3)-'0';

        Arrays.sort(arr);

        int res=((arr[0]*10)+arr[3])+((arr[1]*10)+arr[2]);
        return res;
        
    }
}
