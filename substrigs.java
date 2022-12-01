public class substrigs {
    public static String substrings(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "Hello World";
        str.substring(0,5);
        System.out.println(substrings(str, 0, 4));

    }
    
}
