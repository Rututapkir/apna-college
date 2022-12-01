import java.util.*;
public class function_practice {
    public static int avg_three(int a,int b,int c){
     return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your intput value");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Average of given three num is "+ avg_three(a,b,c));
    }
}
