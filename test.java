import java.util.*;

public class test {
    public static void main(String []args){ 
    Scanner sc= new Scanner(System.in);
    int marks[]= new int [20];


    marks[0]= sc.nextInt();
    marks[1]= sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("Phy :"+ marks[0]);
    System.out.println("chem :"+ marks[1]);
    System.out.println("math :"+ marks[2]);

    marks[2]= marks[2]+3;
    System.out.println("Updated marks are :"+ marks[2]);
    int percentage = (marks[0]+marks[1]+marks[2])/3;
    System.out.println("percentage of given marks are "+percentage +"%");
    System.out.println("Length of array is "+ marks.length);

    }
}