public class pattern {
    public static void main(String args[]){
        int n = 5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(i%2==0){
                    System.out.print(j);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
    
}
