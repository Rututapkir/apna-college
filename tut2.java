import java.util.*;
public class tut2 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        int product=a*b;
        System.out.println("sum of two number is "  + sum);
        System.out.println("Product of two num is "+ product) ;
       scanner.close();
    }
    
}
