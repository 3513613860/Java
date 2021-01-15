/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        //如果没有结点或者只有一个结点，返回头结点
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur1 = head;
        ListNode cur2 = head;
        //双层循环
        while(cur1 != null){
            ListNode pre = cur1;
            cur2 = cur1.next;
            while(cur2 != null){
                //相等时，删除该结点
                if(cur2.val == cur1.val){
                    pre.next = cur2.next;
                    //不相等时，pre往后走
                }else{
                    pre = cur2;
                }
                cur2 = cur2.next;
            }
            cur1 = cur1.next;
        }
        return head;      
    }
}