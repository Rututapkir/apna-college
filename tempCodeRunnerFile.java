import java.util.*;
public class sol{
    public static int BinarySearch(int numbers[],int key){
        int start = 0,end =numbers.length-1;
        
        while(start<=end){
            int mid = (start+end)/numbers.length;
            if(numbers[mid]==start){
                return mid;
            }if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
            }
            public static void main(String args[]){
                int numbers[]= {1,4,6,7,8,22};
                Scanner sc = new Scanner(System.in);
                int key = sc.nextInt();
                System.out.println("Index of key is "+ BinarySearch(numbers,key));            }
}