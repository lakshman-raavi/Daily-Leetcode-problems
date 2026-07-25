class Solution {
    public int maxProduct(int n) {
        int size=(int) Math.floor(Math.log10(n)) + 1;
        int[] arr=new int[size];
        int k=0;
        while(n!=0){
            arr[k]=n%10;
            k++;
            n/=10;
        }

        Arrays.sort(arr);

        return arr[size-1]*arr[size-2];
    }
}
