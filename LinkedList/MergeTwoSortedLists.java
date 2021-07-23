//Merge Two Sorted Lists
//Merge two sorted linked lists and return it as a sorted list. 
//The list should be made by splicing together the nodes of the first two lists.

public class MergeTwoSortedLists{
   ListNode l1, l2;
   
   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
   
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if(l1 == null)
         return l2;
         
      if(l2 == null)
         return l1;
         
      if(l1.val < l2.val){
         l1.next = mergeTwoLists(l1.next, l2);
         return l1;
      }
      
      else{
         l2.next = mergeTwoLists(l1, l2.next);
         return l2;
      }
   }

   public static void main(String[] args){
      MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
      
      mtsl.l1 = new ListNode (1);
      mtsl.l1.next = new ListNode (2);
      mtsl.l1.next.next = new ListNode (4);
      
      mtsl.l2 = new ListNode (1);
      mtsl.l2.next = new ListNode (3);
      mtsl.l2.next.next = new ListNode (4);
      
      System.out.println("Merged list");
      ListNode l3 = mtsl.mergeTwoLists(mtsl.l1, mtsl.l2);
      
      while(l3 != null){
         System.out.print(l3.val+" ");
         l3 = l3.next;
      }
   }
}