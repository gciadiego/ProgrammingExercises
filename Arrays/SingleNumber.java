//Single Number
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

import java.util.Arrays;

public class SingleNumber{
   public int singleNumber(int[] nums) {
      Arrays.sort(nums);
      int num = 0;
      
      for(int i=0; i<=nums.length; i++){
         num = nums[i];
         
         if(i+1 < nums.length)
            if(nums[i] != nums[i+1])
               break;
            else
               i++;
            else
               break;
         }
         
      return num;
   }
   
   public static void main(String[] args){
      SingleNumber sn = new SingleNumber();
      int[] nums = {4,1,2,1,2};
      //int[] nums = {2,2,1};
      //int[] nums = {1};
      
      System.out.println("The single number in the list is "+sn.singleNumber(nums));
   }
}