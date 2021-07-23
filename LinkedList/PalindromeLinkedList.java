//Palindrome Linked List
//Given the head of a singly linked list, return true if it is a palindrome.

import java.util.*;

public class PalindromeLinkedList{
   ListNode head;
   
   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
   
   public boolean isPalindrome(ListNode head) {
      ArrayList<Integer> values = new ArrayList<>();
      
      while(head != null){
         values.add(head.val);
         head = head.next;
      }
      
      int i = 0;
      int j = values.size()-1;
      int left = values.get(i);
      int right = values.get(j);
      
      while(i < j){
         left = values.get(i);
         right = values.get(j);
         
         if(left != right)
            return false;
            
         i++;
         j--;
      }
      
      return true;
   }

   public static void main(String[] args){
      PalindromeLinkedList pll = new PalindromeLinkedList();
      
      pll.head = new ListNode (1);
      pll.head.next = new ListNode (2);
      pll.head.next.next = new ListNode (2);
      pll.head.next.next.next = new ListNode (1);
      
      System.out.println("Is the list palindrome?");
      System.out.println(pll.isPalindrome(pll.head));
   }
}