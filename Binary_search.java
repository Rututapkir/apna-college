import java.util.*;

//Imagine a Dictionary 

public class Binary_search {
    public static int binarySearch(int number[],int key){
        int start= 0;
        int end= number.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            //comparisions 

            if(number[mid]==key){
                return mid;

            }
            if(number[mid]<key){
                //right update start 

                start= mid+1;
            }else{
                //left update end

                end=mid-1;
            }
        }
        return -1;
    }
 public static  void main (String [] args){
int number[]= {2,4,6,8,10,12,14};
Scanner sc = new Scanner(System.in);
int key = sc.nextInt();
System.out.println("index of key is : " +binarySearch(number,key));
}
        
    }

