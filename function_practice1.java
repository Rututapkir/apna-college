import  java.util.*;
public class function_practice1 {
    public static boolean isEven (int num){
        if(num%2==0){
            return true;
           }else {
return false;
    }
}
public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your num ");
       int n = sc.nextInt();
       if(isEven(n)){
        System.out.println("Given num is Even");
       }else{
        System.out.println("Given num is odd");
       }

}
        }

    