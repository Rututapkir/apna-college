public class loop3 {
    //print Reverse of a number
    public static void main(String[]args){
        int n= 68906;
        while(n>0){
            int lastDigit= n%10;
            System.out.print(lastDigit);
            n=n/10;

        }
        System.out.println();
    }
    
}
