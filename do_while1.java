import java.util.*;
public class do_while1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // print reverse of given num 

        do{
            int lastdigt= n%10;
            System.out.print(lastdigt);
            n=n/10;
        }while(n>0);
        System.out.println();
    }
    
}
