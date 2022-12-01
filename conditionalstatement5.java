import java.util.*;
/*Income tax calculator
income<5l 0% tax
income between 5-10L 20% tax
income > 10L 30% tax
*/

public class conditionalstatement5 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int income= sc.nextInt();
        int tax;
        if(income<500000)
        {
            tax=0;
        }else if(income>=500000 && income<100000){
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("Your tax is "+ tax);


    }
    
}
