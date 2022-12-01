public class stringPalindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
                //nor a palindrome

            }
        }
        return true;

    }
    public static void main (String args []){
        String str="noon";
        System.out.println(isPalindrome(str));
    }
    
}
