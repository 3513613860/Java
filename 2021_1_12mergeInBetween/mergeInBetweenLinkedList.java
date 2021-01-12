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
        ListNode cur1 = list1;
        ListNode cur2 = list1;
        //让cur1往后走a-1步
        while(a > 1){
            cur1 = cur1.next;
            a--;
        }
        //让cur2往后走b+1步
        while(b >= 0){
            cur2 = cur2.next;
            b--;
        }
        //cur1的next指向list2
        cur1.next = list2;
        ListNode cur = list2;
        //找到list2的尾结点
        while(cur.next != null){
            cur = cur.next;
        }
        //尾结点指向cur2
        cur.next = cur2;
        return list1;
    }
}