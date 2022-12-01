import java.util.*;

public class strings1 {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
    
        public static void main(String args[]){   
           // char arr[]={a,b,c,d};
           // String str="abcd";
            //String str2=new String("xyz");
    
            //String are IMMUTABLE 
    
            /*Scanner sc =new Scanner(System.in);
            String name;
            name=sc.nextLine();
            System.out.println(name);*/
    
    
           //Concatanation 
    
            String firstname="Rutuja";
            String lastname ="Tapkir";
            String fullname= firstname+" "+lastname;
            //System.out.println(fullname.charAt(0));
            printLetters(fullname);
    
        }
}
