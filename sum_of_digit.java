import java.util.*;
public class sum_of_digit {
public static int sumOfdigit (int n){
    int sum = 0;
    while (n>0){
        int lastdigit = n%10;
        sum += lastdigit ;
        n = n/10;
    }
    return sum;

}    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your num");
    int digit =sc.nextInt();
    System.out.println(sumOfdigit(digit));
}
}
