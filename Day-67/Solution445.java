class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Deque<Integer> st1 = new ArrayDeque<>();
        Deque<Integer> st2 = new ArrayDeque<>();

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        while (ptr1 != null) {
            st1.push(ptr1.val);
            ptr1 = ptr1.next;
        }

        while (ptr2 != null) {
            st2.push(ptr2.val);
            ptr2 = ptr2.next;
        }

        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!st1.isEmpty() || !st2.isEmpty() || carry > 0) {

            int sum = carry;

            if (!st1.isEmpty()) {
                sum += st1.pop();
            }

            if (!st2.isEmpty()) {
                sum += st2.pop();
            }

            ListNode newnode = new ListNode(sum % 10);

            carry = sum / 10;

            current.next = newnode;
            current = newnode;
        }

        
        ListNode curr = dummy.next;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
