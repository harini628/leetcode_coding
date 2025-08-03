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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        ListNode dummynode = new ListNode(0);
        ListNode currentnode = dummynode;
        while(list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;
            arrlist.add(val1);
            arrlist.add(val2);
            list1 = list1.next;
            list2 = list2.next;
        }
        while(list1 != null){
            int value = list1.val;
            arrlist.add(value);
            list1 = list1.next;
        }
        while(list2 != null){
            int value2 = list2.val;
            arrlist.add(value2);
            list2 = list2.next;
        }
        Collections.sort(arrlist);
        for(int i : arrlist){
            ListNode sample = new ListNode(i);
            currentnode.next = sample;
            currentnode = currentnode.next;
        }
        return dummynode.next;
    }
}
