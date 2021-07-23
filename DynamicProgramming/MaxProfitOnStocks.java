//Best Time to Buy and Sell Stock
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

import java.io.*;

public class MaxProfitOnStocks{
   public int maxProfit(int[] prices) {
      int min = prices[0];
      int max = 0;
      int profit = 0;
        
      if (prices.length == 0)
         return profit;
        
      for(int i=0; i <= prices.length-1; i++){           
         if(prices[i] < min)
            min = prices[i];
            
         profit = prices[i] - min;
            
         if(profit > max)
            max = profit;
      }
      
      return max;
   }
   
   public static void main(String[] args){
      MaxProfitOnStocks mpos = new MaxProfitOnStocks();
      
      int[] prices = {7,1,5,3,6,4};
      
      System.out.println("Max profit");
      System.out.println(mpos.maxProfit(prices));
   }
}