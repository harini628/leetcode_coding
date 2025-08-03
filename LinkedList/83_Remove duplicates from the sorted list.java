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
import java.util.*;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        while(head != null){
            int data = head.val;
            boolean flag = true;
            for(int i:arrlist ){
                if(i == data){
                    flag = false;
                    break;
                }
            }
            if(flag){
                arrlist.add(data);
            }
            head = head.next;
        }
        ListNode dummynode = new ListNode(0);
        ListNode currentnode = dummynode;
        for(int j:arrlist){
            ListNode sample = new ListNode(j);
            currentnode.next = sample;
            currentnode = currentnode.next;
        }
        return dummynode.next;
    }
}
