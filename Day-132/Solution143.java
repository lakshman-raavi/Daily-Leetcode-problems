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
    public void reorderList(ListNode head) {
        // List<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // int count = 1;
        // while (temp != null) {
        //     list.add(temp.val);
        //     count++;
        //     temp = temp.next;
        // }

        // int n = list.size();
        // ListNode dummy = new ListNode(-1);
        // ListNode ptr = dummy;
        // for (int i = 0; i < n / 2; i++) {
        //     ListNode n1 = new ListNode(list.get(i));
        //     ListNode n2 = new ListNode(list.get(n - i - 1));
        //     ptr.next = n1;
        //     ptr = n1;
        //     ptr.next = n2;
        //     ptr = n2;
        // }

        // if (n % 2 != 0) {
        //     ListNode n1 = new ListNode(list.get(n / 2));
        //     ptr.next = n1;
        //     ptr = n1;
        // }

        // temp = dummy.next;
        // ListNode curr = head;

        // while (temp != null) {
        //     curr.val = temp.val;
        //     curr = curr.next;
        //     temp = temp.next;
        // }


        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode curr=slow;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        slow=prev;
        ListNode ptr=head;
        ListNode ptr2=slow;
        ListNode newlist=head;
        while(ptr.next!=slow){
            
        }

    }
}
