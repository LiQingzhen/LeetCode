/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode result = null;
        int carry = 0;  // 进位
        boolean flag = true;
        while(l1 != null || l2 != null || carry != 0) {
            temp.next = new ListNode(0);
            temp = temp.next;
            if (l1 == null && l2 == null) {
                temp.val = carry;
                carry = 0;
            } else if (l1 == null) {
                temp.val = (carry + 0 + l2.val) % 10;
                carry = (carry + 0 + l2.val) / 10;
            } else if (l2 == null){
                temp.val = (carry + l1.val + 0) % 10;
                carry = (carry + l1.val + 0) / 10;
            } else {
                temp.val = (carry + l1.val + l2.val) % 10;
                carry = (carry + l1.val + l2.val) / 10;
            }
            // 保存链表开始位置
            if (flag) {
                result = temp;
                flag = false;
            }
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        return result;
    }
}