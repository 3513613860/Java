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
    public ListNode partition(ListNode head, int x) {
        if(head ==null){
            return null;
        }
        ListNode cur = head;
        //定义两个头结点,方便表示
        ListNode LA = new ListNode(-1);
        ListNode LB = new ListNode(-1);
        ListNode LAtail = LA;
        ListNode LBtail = LB;
        //遍历单链表，小于x的放在A，其他放在B中
        while(cur != null){
            if(cur.val < x){
                LAtail.next = cur;
                LAtail = LAtail.next;
            }else{
                LBtail.next = cur;
                LBtail = LBtail.next;
            }
            cur = cur.next;
        }
        //将A的尾连在B的头上
        LAtail.next = LB.next;
        //将B的尾后置空
        LBtail.next =null;
        return LA.next;
    }
}