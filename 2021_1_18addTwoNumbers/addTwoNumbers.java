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
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int m = 0;
        int n = 0;
        //遍历l1与l2,m保存当前位，n保存进位
        while(cur1 != null && cur2 != null){
            m = (n + cur1.val + cur2.val)%10;
            n = (n+cur1.val+cur2.val)/10;
            //将m放入node中
            ListNode node = new ListNode(m);
            //进行尾插
            cur.next = node;
            cur = cur.next;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        //cur1不为空，继续往后尾插
        while(cur1 != null){
            m = (n + cur1.val)%10;
            n = (n+cur1.val)/10;
            ListNode node = new ListNode(m);
            cur.next = node;
            cur = cur.next;
            cur1 = cur1.next;            
        }
        //cur2不为空，继续往后尾插
        while(cur2 != null){
            m = (n + cur2.val)%10;
            n = (n+cur2.val)/10;
            ListNode node = new ListNode(m);
            cur.next = node;
            cur = cur.next;
            cur2 = cur2.next;            
        }
        //如果有进位，尾插
        if(n == 1){
            ListNode node = new ListNode(1);
            cur.next = node;
        }        
        return head.next;        
    }
}