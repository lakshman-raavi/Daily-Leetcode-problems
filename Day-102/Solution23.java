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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(ListNode list : lists){
            ListNode ptr=list;
            while(ptr!=null){
                pq.offer(ptr.val);
                ptr=ptr.next;
            }
        }

        ListNode dummy=new ListNode(-1);
        ListNode curr=null;
        curr=dummy;
        while(pq.size()!=0){
            ListNode newnode=new ListNode(pq.poll());
            curr.next=newnode;
            curr=newnode;
        }

        return dummy.next;
    }
}
