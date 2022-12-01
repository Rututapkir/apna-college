import java.util.*;

import javax.xml.validation.Validator;
public class half_pyramid {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i= 1;i<=n;i++){

            //print numbers
           
           for(int j=1;j<=i;j++){
            System.out.print(j);
           }
           System.out.println();
        }
    } 
    
}
