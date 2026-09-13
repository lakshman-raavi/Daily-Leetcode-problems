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

    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode currnode=head;
        ListNode next=null;
        while(currnode!=null){
            next=currnode.next;
            currnode.next=prev;
            prev=currnode;
            currnode=next;
        }

        head=prev;
        return head;
        
    }
    public ListNode doubleIt(ListNode head) {
        ListNode duplicate=reverseList(head);

        ListNode dummy=new ListNode(-1);
        ListNode curr=null;
        curr=dummy;
        int sum=0;
        int carry=0;
        ListNode ptr=duplicate;
        while(ptr!=null){
            sum=carry;
            sum+=((ptr.val)*2);
            ListNode newnode=new ListNode(sum%10);
            carry=(sum/10);
            curr.next=newnode;
            curr=newnode;
            ptr=ptr.next;
        }
        
        if(carry>0){
            ListNode newnode=new ListNode(carry);
            curr.next=newnode;
            curr=newnode;
        }

        ListNode res=reverseList(dummy.next);

        return res;

     

    }
}
