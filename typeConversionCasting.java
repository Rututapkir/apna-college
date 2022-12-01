import java.util.*;
public class typeConversionCasting {
    //double >long>float>int>short>byte
    // byte->short->int-> float-> long-> double->
    public static void main(String []args){
        Scanner Sc = new Scanner (System.in);
        float a= 21.12f;
       // int b= a;it gives lossy conversion 
       int b=(int)a;
       System.out.println(b);
       char ch ='a';
       char ch2= 'b';
       int number = ch;
       int number2= ch2;
       System.out.println(number);
       System.out.println(number2  );

Sc.close();
    }
}
