/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(mat[i],-1);
        }

        ListNode ptr=head;
        int top=0,bottom=m-1,left=0,right=n-1;
            
            while(top<=bottom && left<=right){
                
                for(int i=left;i<=right && ptr!=null;i++){
                    mat[top][i]=ptr.val;
                    ptr=ptr.next;
                }
                top++;

                for(int i=top;i<=bottom && ptr!=null;i++){
                    mat[i][right]=ptr.val;
                    ptr=ptr.next;
                }
                right--;


                if(top<=bottom){
                    for(int i=right;i>=left && ptr!=null;i--){
                        mat[bottom][i]=ptr.val;
                        ptr=ptr.next;
                    }
                    bottom--;
                }

                if(left<=right){
                    for(int i=bottom;i>=top && ptr!=null;i--){
                        mat[i][left]=ptr.val;
                        ptr=ptr.next;
                    }
                    left++;
                }
            }
            
        

        return mat;
    }
}
