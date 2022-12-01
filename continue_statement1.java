import java.util.*;
public class continue_statement1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        do{  
            System.out.println("enter your num:");
            int n= sc.nextInt();

            if(n%10==0){
                continue;
            }
             System.out.println("number was n : "+ n);
        }while(true);
    }
    
}
