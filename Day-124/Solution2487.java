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
    public ListNode removeNodes(ListNode head) {
        Deque<Integer> st=new ArrayDeque<>();

        ListNode ptr=head;

        while(ptr!=null){
            if(st.isEmpty()){
                st.push(ptr.val);
            }
            else{
                while(!st.isEmpty() && st.peek()<ptr.val){
                    st.pop();
                }
                st.push(ptr.val);
            }
            ptr=ptr.next;
        }

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(st.size()>0){
            ListNode node=new ListNode(st.pop());
            temp.next=node;
            temp=node;
        }

        ListNode curr=dummy.next;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        dummy=prev;

        return dummy;
    }

}
