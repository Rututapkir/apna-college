import java.util.*;
public class linearSearch_stringarray {
    public static boolean linearString(String dish[],String key){
        boolean searchReturn ;
        for(int i=0;i<dish.length;i++){
            if(dish[i] == key){
                 searchReturn= true;
            }if(searchReturn= true){
                return searchReturn;
            }
        }
        return false;
      
    }
    public static void main(String args[]){
        String dish[]= {"Samosa", "Momos","Panipuri","Vadapav","Manchurian"};
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        boolean index = linearString(dish, key);
        if(index== true){
            System.out.println("key is found ");
        }else{
            System.out.println("key not found");
        }
       

    }
    
}
