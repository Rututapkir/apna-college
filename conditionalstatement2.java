import java.util.*;
//print the largest of 2 nums
public class conditionalstatement2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        if(A>B){
            System.out.println("Largest num is " + "A");
        }
        else{
            System.out.println("Largest num is " + "B");
        }
    }
    
}
