import java.util.*;
public class fuctions1 {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f; //factoial of 
    }
    public static void main(String args[]){
       int a= 3;
       int b= 6;
       int prod= multiply(a,b);
       System.out.println("a*b= "+ prod);
        prod = multiply(7,8);
       System.out.println("a*b= " + prod); //multiply
       System.out.println(factorial(7)); //fctorial
        }
}
