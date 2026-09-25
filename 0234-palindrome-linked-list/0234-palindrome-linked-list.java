class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = head;
        ListNode tmp1 = new ListNode(0);
        ListNode helper = tmp1;

        while(dummy != null) {
            helper.next = new ListNode(dummy.val);
            dummy = dummy.next;
            helper = helper.next;
        }

        tmp1 = tmp1.next;
        ListNode tmp2 = reverseList(head);

        while(tmp1 != null) {
            if(tmp1.val != tmp2.val)
                return false;
            else {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}