//Reverse Linked List
//Given the head of a singly linked list, reverse the list, and return the reversed list.

import java.util.*;

public class ReverseLinkedList{
   ListNode head;
   
   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
   
   public ListNode reverseList(ListNode head) {
      ArrayList<Integer> values = new ArrayList<>();
      ListNode head2 = head;
      
      System.out.print("Original list: ");
      while(head != null){
         values.add(head.val);
         System.out.print(head.val+" ");
         head = head.next;
      }
        
      head = head2;
      int i = values.size()-1;
     
      System.out.print("\nRotated list: ");
      while(head != null){
         head.val = values.get(i);
         System.out.print(head.val+" ");
         head = head.next;
         i--;
      }
        
      head = head2;
      
      return head;
   }

   public static void main(String[] args){
      ReverseLinkedList rll = new ReverseLinkedList();
      
      rll.head = new ListNode (1);
      rll.head.next = new ListNode (2);
      rll.head.next.next = new ListNode (3);
      rll.head.next.next.next = new ListNode (4);
      rll.head.next.next.next.next = new ListNode (5);
            
      rll.reverseList(rll.head);
   }
}