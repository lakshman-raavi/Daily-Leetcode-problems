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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();

        ListNode ptr=head;
        while(ptr!=null){
            list.add(ptr.val);
            ptr=ptr.next;
        }
        Deque<Integer> st=new ArrayDeque<>();
        int[] res=new int[list.size()];
        int k=0;
        for(int i=list.size()-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=list.get(i)){
                st.pop();
            }
            if(st.isEmpty()==true){
                res[k]=0;
            }
            else{
                res[k]=st.peek();
            }
            st.push(list.get(i));
            k++;
        }

        for(int i=0;i<res.length/2;i++){
            int temp=res[i];
            res[i]=res[res.length-i-1];
            res[res.length-i-1]=temp;
        }
        return res;


    }
}
