import java.util.*;
public class optimize_prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); 
        boolean isPrime =true;
   
        if(n==2){
           System.out.println("Given num is prime");
        }else{
           for(int i=2;i<=Math.sqrt(n);i++){
               if(n%i==0){
                   //n is multiple of i (i not equal to 1 or n)
                   isPrime=false;
                  
               }
                   
            }
            if(isPrime==true){
               System.out.println("Given number "+ n +" is Prime");
            }else{
               System.out.println("Given num "+ n +" is not prime");
            }
           } 
       }
}
