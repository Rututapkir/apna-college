public class selectionSort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
       public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++) {  //turns count 
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){  //find the min in unsorted part
                    minPos=j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }     
     }
    public static void main (String args[]){
        int arr[]={5,4,1,3,2};
        
       selectionSort(arr);
        printarr(arr);
    }
    
}
