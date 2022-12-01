public class subArrays {
    public static void PrintSubarrays(int numbers[]){
        int ts= 0;  //total subarrays
        
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){  // we have to print single elent also 
                //thats why j = i inorder of i+1
                
                int end= j;
                for(int k=start;k<= end;k++){
                    System.out.print(numbers[k]+" ");  //subarrays
                    
                   
                }
                System.out.println();
                ts++;  
                // n(n+1)/2
            }
            System.out.println();
            
            
        }
        System.out.println("total subarrays of given arrays are: "+ ts);
       
        
    }
    public static void main (String args[]){
        int numbers[]= {2,4,6,8,10};
        PrintSubarrays(numbers);
    }
    
}
