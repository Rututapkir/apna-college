import java.util.*;
public class reverse_of_num  {
    public static void main (String []args){
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      while(n>0){
        int lastDigit= n%10;
        System.out.print(lastDigit);
        n=n/10;

    }
    System.out.println();

    }
    
}
