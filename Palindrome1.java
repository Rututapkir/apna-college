import java.util.*;


public class Palindrome1 {
    public static boolean  isPalindrome (int n){
        int Palindrome = n;  //copy into variable
        
        int reverse = 0;

        //reverse = reverse*10 + lastdigit 
        // last digit = num% 10

        while(Palindrome>0){
            int lastDigit = Palindrome%10;
            reverse = reverse *10 + lastDigit;
            Palindrome = Palindrome/10;
        }

       //if original and the reverse of number id equal means number is palindrome in java

       if (n==reverse){
        return true;
       }else{
        return false;
       }
  }
    public static void main(String args[]){
        System.out.println("Please Enter a number : ");
        Scanner sc= new Scanner(System.in);
        int palindrome= sc.nextInt();
        

        if(isPalindrome(palindrome)){
            System.out.println("Number : "+ palindrome +" is a palindrome");
        }else{
            System.out.println("Number : "+ palindrome +" is not a palindrome");
        }
        }
        }
    
