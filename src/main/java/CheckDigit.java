import java.util.*;
class CheckDigit 
{   
   public static int getCheck(int num) 
   {  
     int sum = 0;
     int b = num;
     ArrayList <Integer> a = new ArrayList <Integer>();
     for(int i = 0; i < getNumberOfDigits(num); i++){
       a.add(b%10,0);
       b=b/10;
     }
     for(int i = 0; i < a.size(); i++){
       sum += a.get(i) * (7-i);
     }
     return(sum%10);
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     return(numWithCheckDigit == (numWithCheckDigit / 10) * 10 + getCheck(numWithCheckDigit / 10));
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
