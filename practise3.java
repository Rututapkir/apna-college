import java.util.*;
public class practise3 {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        float pen = Sc.nextFloat();
        float pencil = Sc.nextFloat();
        float eraser = Sc.nextFloat();
        float bill = pen+pencil+eraser;
        
        System.out.println("Bill of customer is " + bill);

        float gst = bill+(0.18f*bill);
        System.out.println("Bill of customer with gst is " + gst);
        Sc.close();

    }
    
}

