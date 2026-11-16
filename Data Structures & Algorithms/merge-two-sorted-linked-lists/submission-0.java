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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode currHead = new ListNode();
        ListNode prevHead = new ListNode();

        if(list1 == null) 
        {
            head = list2;
            return head;
        }
        if(list2 == null) 
        {
            head = list1;
            return head;
        }
        if (list1.val < list2.val)
        {
            head = list1;
            currHead = list1;
            list1 = list1.next;

        }
        else
        {
            head = list2;
            currHead = list2;
            list2 = list2.next;

        }

        prevHead = currHead;

        while( list1 != null && list2 != null)
        {
            if (list1.val < list2.val)
            {
                currHead = list1;
                list1 = list1.next;

            }
            else
            {
                currHead = list2;
                list2 = list2.next;

            }

            prevHead.next = currHead;
            prevHead = currHead;
        }

        if (list1 != null)
        {
            currHead.next = list1;
        }
        else if (list2 != null) 
        {
            currHead.next = list2;
        }

        return head;
    }
}