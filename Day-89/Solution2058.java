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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;

        if (head.next == null || (head.next.next == null)) {
            return new int[] { -1, -1 };
        }

        List<Integer> list = new ArrayList<>();
        int indexc = 2;
        while (curr.next != null) {
            if (prev.val < curr.val && curr.val > next.val) {
                list.add(indexc);
            } else if (prev.val > curr.val && curr.val < next.val) {
                list.add(indexc);
            }
            prev = curr;
            curr = next;
            next = next.next;
            indexc++;
        }

        if (list.size() < 2) {
            return new int[] { -1, -1 };
        }
        

        int max = list.get(list.size() - 1) - list.get(0);
        int min = Integer.MAX_VALUE;

        for(int i=0;i<list.size()-1;i++){
            if(Math.abs(list.get(i)-list.get(i+1))<min){
                min=Math.abs(list.get(i)-list.get(i+1));
            }
        }

        return new int[] { min, max };

    }
}
