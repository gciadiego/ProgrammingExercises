//Reverse String
//Write a function that reverses a string. The input string is given as an array of characters s.

public class ReverseString{
   public void reverseString(char[] s) {
      int count = 0;
      
      System.out.println("Original string");
      for(char v : s)
         System.out.print(v+" ");
      
      for(int i=s.length-1; i>=s.length/2; i--){
         char left = s[count];
         s[count] = s[i];
         s[i] = left;
         count++;
      }
      
      System.out.println("\n");
      System.out.println("Reverse string");
      for(char v : s)
         System.out.print(v+" ");
   }

   public static void main(String[] args){
      ReverseString rs = new ReverseString();
      
      char[] s = "Hello".toCharArray();
      
      rs.reverseString(s);
   }
}