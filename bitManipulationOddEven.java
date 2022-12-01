   public class bitManipulationOddEven{
    /*public static void OddEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            //Even number

System.out.println("Even number");     
   }else{
    System.out.println("Odd number");
   }
    }
    
    /// operation Get ith bit

    public static int getIthbit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }*/

    // operation set Ith bit
    public static int setIthbit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;

    }
    // operation clear ith bit 
    public static int clearIthbit(int n,int i){
        int bitmask= ~(1<<i);
    return n&bitmask;
    }

    public static int updateIthBit(int n,int i,int newBit){
       /*  if(newBit==0){
            retrun clearIthbit(n,i);
        }else {
            return setIthbit(n, i); 
        }*/
         n =clearIthbit(n, i);
        int bitmask=newBit<<i;
        return n|bitmask;
    }

    // clear i no of bits

    public static int clearIBits(int n,int i){
        int bitmask= (~0)<<i;
        return n&bitmask;
    }
    public static void main (String args[]){
      //  OddEven(3);
        //OddEven(14);
        //System.out.println(getIthbit(10,2));
       // System.out.println(setIthbit(10,2));
        //System.out.println(clearIthbit(10,1));
        //System.out.println(updateIthBit(10,2,1));
        System.out.println(clearIBits(15 ,2));
    }
   }