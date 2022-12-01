import java.util.*;

//we have to  make change in original num
public class reverse_the_given_num {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int reverse = 0;

        //reverse = reverse*10 + lastdigit 
        // last digit = num% 10

        while(n>0){
            int lastDigit = n%10;
            reverse = reverse *10 + lastDigit;
            n = n/10;
        }

       System.out.println("Reverse of Given num is "+ reverse);


    }
    
}
