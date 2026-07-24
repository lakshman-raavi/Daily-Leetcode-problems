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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        return null;
        ListNode dummy=new ListNode(-1);
        ListNode curr=head;
        dummy.next = head;
        ListNode ptr=dummy;
        while(curr!=null){
            if(curr.val==val){
                ptr.next=curr.next;
            }
            else{
                ptr=curr;
            }
            curr=curr.next;
        }
        return dummy.next;

    }
}
