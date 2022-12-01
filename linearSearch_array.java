import java.util.*;
public class linearSearch_array {
    public static int linearSearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]== key){
            return i;
        }
     }
     return -1;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in );
        
    int numbers [] = { 2,4,6,8,10,12,14,16};
    System.out.println("Key is : ");
    int key = sc.nextInt();
    int index= linearSearch(numbers,key);
    if (index==-1){
        System.out.println("key not found");
    }else{
System.out.println("Key is at index "+ index);
    }
}
}
