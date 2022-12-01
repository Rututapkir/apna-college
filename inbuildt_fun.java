import java.util.Arrays;
import java.util.Collections;
public class inbuildt_fun {
    public static void insertionSorting(Integer arr[]){
        for(int i=1;i<arr.length;i++){
        int curr =arr[i];
        int prev = i-1;

        //finding out the correct pos to insert
        
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }//insertion
        arr[prev+1]=curr;
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
          
       }  
    public static void main(String args[]){
       Integer arr[]={5,4,1,3,2};
       // insertionSorting(arr);
       Arrays.sort(arr,0,4,Collections.reverseOrder());
        printarr(arr);
        
    }
    
    
}
