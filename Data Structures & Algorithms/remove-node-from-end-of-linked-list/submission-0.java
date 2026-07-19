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
    public ListNode removeNthFromEnd(ListNode head, int n) {
   ListNode current = head ;
         int count = 0;
         while(current != null){
            count++;
            current = current.next ;
           
            }

            int removeIndex = count-n;
            if(removeIndex ==0){
                return head.next;
            }

            current = head ;
            for(int i = 0; i<count-1; i++){
                if((i+1)== removeIndex){
                    current.next = current.next.next;
                    break ;
                }
                current = current.next;
            }

            return head ;

         }
    }

