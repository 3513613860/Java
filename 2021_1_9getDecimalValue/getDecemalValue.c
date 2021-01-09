/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        cur = head;
        int [] arr = new int[count];
        int i = 0;
        while(cur!=null){
            arr[i++] = cur.val;
            cur = cur.next;
        }
        int sum = 0;
        int k = 0;
        for(int j = i-1; j >= 0; j--){
            sum = sum + (int)Math.pow(2,k++)*arr[j];
        }
        return sum;
    }
}