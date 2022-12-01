import java.util.*;
public class largestArray {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;  //-infinity
        int smallest = Integer.MAX_VALUE; // + infinity 
        for(int i= 0;i<numbers.length;i++){
            if(Largest < numbers[i]){
                Largest =numbers[i];
            }if(smallest> numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is "+ smallest );
return Largest;
    }
    public static void main(String args[]){
        int numbers[]= {1,3,5,6,8,9};
        System.out.println("Get Largest value is "+ getLargest(numbers));
    }
    
}
