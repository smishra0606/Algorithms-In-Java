/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=length(headA);
        int lenB=length(headB);
        int diff=Math.abs(lenA-lenB);

        ListNode currA=headA;
        ListNode currB=headB;
        if(lenB>lenA){
            while(diff-->0){
                currB=currB.next;
            }
        }
        else{
            while(diff-->0){
                currA=currA.next;
            }
        }
        while(currA!=currB){
            currA = currA.next;
            currB = currB.next;
        }
        
        return currA;
    }
}