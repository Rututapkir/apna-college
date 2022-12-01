import java.util.*;
public class conditional_practice1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();

        if(temperature>100){
            System.out.println("You have a Fever");

        }else{
            System.out.println("You don't have a Fever");
        }
    }
    
}
