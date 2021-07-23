//Convert Sorted Array To Binary Search Tree

//Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

public class ConvertSortedArrayToBST{
   Node root;
   
   class Node{
      int val;
      Node left;
      Node right;
      
      Node(int v){
         val = v;
      }
   }
   
   public Node addNode(Node node, int val){
      Node newNode = new Node(val);
      
      if (node == null)
         root = newNode;
      else{
         if(newNode.val >= node.val){
            if(node.right == null)
               node.right = newNode;
            else
               addNode(node.right, val);
         }
         else{
            if(node.left == null)
               node.left = newNode;
            else
               addNode(node.left, val);
         }
      }
      
      return root;
   }
   
   public Node findNumbers(int[] nums, int beginning, int end){
      if (beginning > end)
         return null;
         
      int number = (beginning+end)/2;
      
      addNode(root, nums[number]);
      
      findNumbers(nums, beginning, number-1);
      findNumbers(nums, number+1, end);
      
      return root;
   }
   
   public void preOrderTraversal(Node node){
      if(node == null)
         return;
      else{
         System.out.print(node.val+" ");
         
         if(node.left != null){
            preOrderTraversal(node.left);
         }
         
         if(node.right != null){
            preOrderTraversal(node.right);
         }
         
         return;
      }
   }

   public static void main(String[] args){
      ConvertSortedArrayToBST csatbst = new ConvertSortedArrayToBST();
   
      int[] nums = {-10,-3,0,5,9};
   
      csatbst.findNumbers(nums, 0, nums.length-1);
      
      csatbst.preOrderTraversal(csatbst.root);
   }
}