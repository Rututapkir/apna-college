public class fastExponential {
    public static int fastExpo(int a,int n){  // a^n
        int ans=1;
        while(n>0){
            if((n&1) !=0){
                // LSB if value is one setbit is there 

                ans=ans*a;

            }
            a=a*a;
            n=n>>1;
            
        }
        return ans;

    }
    public static void main(String args[]){
        System.out.println(fastExpo(5, 3));
    }
    
}
