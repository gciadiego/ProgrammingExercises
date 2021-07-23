//Climbing Stairs
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

import java.io.*;

public class ClimbingStairs{
   public int climbStairs(int n) {
      if(n == 0)
         return 0;
      else if(n == 1)
         return 1;
      else{
         int x = 1;
         int y = 1;
         int resp = 0;

         for(int i=2; i<=n; i++){
            resp = (x + y);
            y = x;
            x = resp;
         }
        
         return resp;
      }
   }
   
   public static void main(String[] args){
      ClimbingStairs cs = new ClimbingStairs();
      System.out.println("Distinct ways to climb 5 stairs");
      System.out.println(cs.climbStairs(5));
   }
}