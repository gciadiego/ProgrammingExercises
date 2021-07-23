//Rotate Array
//Given an array, rotate the array to the right by k steps, where k is non-negative.

public class RotateArray{
   public void rotate(int[] nums, int k) {
      int[] newArray = new int[nums.length];
      int count = 0;
      
      for(int i=nums.length-k; i<nums.length; i++){
         newArray[count] = nums[i];
         count++;
      }
      for(int i=0; i<nums.length-k; i++){
         newArray[count] = nums[i];
         count++;
      }
      
      System.out.print("\nRotated list: ");
         for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
         }
   }
   
   public static void main(String[] args){
      RotateArray ra = new RotateArray();
      /*int[] nums = {-1,-100,3,99};
      int k = 2;*/
      
      /*int[] nums = {1,2,3,4,5,6,7};
      int k = 3;*/
      
      /*int[] nums = {-1};
      int k = 2;*/
      
      int[] nums = {1,2};
      int k = 3;
      
      //By getting the modular, you get the actual amount of iterations you have to do
      k = k % nums.length;
            
      System.out.print("Initial list: ");
      for(int i=0; i<nums.length; i++)
         System.out.print(nums[i]+" ");
      
      ra.rotate(nums, k);
   }
}