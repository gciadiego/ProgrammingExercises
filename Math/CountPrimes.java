//Count Primes
//Count the number of prime numbers less than a non-negative number, n

import java.io.*;

public class CountPrimes{
   public int countPrimes(int n) {
      int count = 0;
        
      if(n<=1)
         return 0;
         
      for(int i = 2; i<n; i++){
         for(int j = 2; j<=i; j++){
            if(i%j == 0 && i!=j)
               break;
            
            if(i%j == 0 && i==j)
               count++;
         }
      }
        
      return count;
   }
   
   public static void main(String[] args){
      CountPrimes cp = new CountPrimes();
      
      int n = 15;
      
      System.out.println("Amount of prime numbers before "+n);
      System.out.println(cp.countPrimes(n));
   }
}