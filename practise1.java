import java.util.*;
public class practise1 {
    public static void main (String[]args){
        Scanner Sc= new Scanner(System.in);
        int A=Sc.nextInt();
        int B=Sc.nextInt();
        int C=Sc.nextInt();
        int avg = A+B+C/3;
        System.out.println("Avg of given three num is "+ avg);
        Sc.close();

    }
}
