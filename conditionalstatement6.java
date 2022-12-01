import java.util.*;
//print the largest of three
public class conditionalstatement6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if((A>=B)&&(A>=C)){
            System.out.println("Largest of given 3 num is A");
        }
        else if(B>=C){
            System.out.println("Largest of given 3 num is B");
        }
        else{
            System.out.println("Largest of given 3 num is C");
        }

    }

}
