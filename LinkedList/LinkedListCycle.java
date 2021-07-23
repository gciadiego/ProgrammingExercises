//Linked List Cycle

//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.

public class LinkedListCycle{
   ListNode head;
   
   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
   
   public boolean hasCycle(ListNode head) {
      while(head != null && head.next != null){
         head.val = 100001;
         
         if(head.next.val == 100001)
            return true;
            
         head = head.next;
      }
      
      return false;
   }
   
   public static void main(String[] args){
      LinkedListCycle llc = new LinkedListCycle();
      
      llc.head = new ListNode (3);
      llc.head.next = new ListNode (2);
      llc.head.next.next = new ListNode (0);
      llc.head.next.next.next = new ListNode (-4);
      llc.head.next.next.next = llc.head.next;
      
      //llc.head = new ListNode (1);
      
      System.out.println("Does the linked list have a cylce?");
      if(llc.hasCycle(llc.head))
         System.out.println("True");
      else
         System.out.println("False");
   }
}