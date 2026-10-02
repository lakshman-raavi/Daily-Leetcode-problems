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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr=list1;
        int count1=a-1;
        int count2=b-a+1;
        while(count1!=0 && ptr!=null){
            ptr=ptr.next;
            count1--;
        }
        ListNode ptr2=null;
        if(ptr.next!=null){
            ptr2=ptr.next;
        }
        
        while(count2!=0 && ptr2!=null){
            ptr2=ptr2.next;
            count2--;
        }
        
        ListNode bptr=list2;
        while(bptr!=null){
            ptr.next=bptr;
            ptr=bptr;
            bptr=bptr.next;
        }

        ptr.next=ptr2;
        return list1;
    }
}
