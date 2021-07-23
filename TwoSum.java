//Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class TwoSum{
   public int[] twoSum(int[] nums, int target) {
      int[] newArray = new int[2];
      
      for(int i=0; i <= nums.length; i++){
         for(int j=i+1; j <= nums.length-1; j++){
            if(nums[i] + nums[j] == target){
               newArray[0] = i;
               newArray[1] = j;
               System.out.println(i+" ("+nums[i]+") and "+j+" ("+nums[j]+")");
               return newArray;
            }
         }
      }
      
      return newArray;
   }
   
   public static void main(String[] args) {
      TwoSum ts = new TwoSum();
      
      int[] nums = {2,7,11,15};
      int target = 9;
      
      /*int[] nums = {3,2,4};
      int target = 6;
      
      int[] nums = {3,3};
      int target = 6;*/
      
      System.out.println("The two indexes of the values that sum "+target+" are:");
      ts.twoSum(nums, target);
   }
}