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
          ListNode left =list1;
          for(int i = 0; i <a-1 ; i++){
            left = left.next;
          }
          ListNode right = list1;
          for(int j = 0; j <= b; j++){
            right = right.next;
          }
           
           ListNode temp = list2;

           while(temp.next != null){
            temp = temp.next;
           }

           temp.next = right;
           left.next = list2; 
return list1;

    }
}