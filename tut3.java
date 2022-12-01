import java.util.*;
//Area of circle
public class tut3 {
    public static void main (String []args){
        Scanner Sc = new Scanner(System.in);
        float rad= Sc.nextFloat();
        float area= 3.14f*rad*rad;
        System.out.println("Area of given circle is "+ area);
        Sc.close();
    }
    
}
