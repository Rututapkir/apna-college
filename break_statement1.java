import java.util.*;
public class break_statement1 {
    
    // Keep entering num till user enters a multiple of 10 

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        do{
             System.out.println("Enter your num");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
            
        }while(true);

    }
    
}
