package Logic_Problems_Solutions;
import java.util.*;
class StringReversingWithoutArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //Accepting the input string from user
        System.out.println("Enter the string");
        String str=sc.next();
        int len=str.length();
        String str1="";
        
        //Storing the string into an array
        for(int i=len-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        
        //Printing the reversed string
        System.out.println(str1);
        sc.close();
    }
}