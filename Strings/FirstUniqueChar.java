//First Unique Char
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

public class firstUniqueChar{
   public int firstUniqueChar(String s) {
      char[] charString = s.toCharArray();
      
      for(int i=0; i < charString.length; i++){
         for(int j=0; j < charString.length; j++){
            if(i==j && i == (charString.length-1))
               return i;
            
            if(i!=j && charString[i] == charString[j])
               break;
               
            if(i!=j && j==(charString.length-1) && charString[i] != charString[j])
               return i;
            }
        }
        
        return -1;
    }
   
   public static void main(String[] args){
      firstUniqueChar fuc = new firstUniqueChar();
      
      String s = "lovecoding"
      
      System.out.println("The position of the single character in the string is "+fuc.firstUniqueChar(s));
   }
}