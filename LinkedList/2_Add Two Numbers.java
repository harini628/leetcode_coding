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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummynode = new ListNode(0);
        ListNode currentnode = dummynode;
        int carry = 0;
        while(l1 != null || l2 != null){
            int val1 = (l1 != null) ? l1.val:0;
            int val2 = (l2 != null) ? l2.val:0;
            int sum = carry + val1+val2;
            carry = sum/10;
            ListNode sample = new ListNode(sum%10);
            currentnode.next = sample;
            currentnode = sample;
            l1 = (l1 != null)?l1.next:l1;
            l2  = (l2 != null)?l2.next:l2;
        }
        if(carry>0){
            ListNode sample = new ListNode(carry);
            currentnode.next = sample;
        }
        return dummynode.next;
    }
}

