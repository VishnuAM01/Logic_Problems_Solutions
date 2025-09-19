package Logic_Problems_Solutions;
/* Reverse the string*/
import java.util.*;
class StringReversing {
    public static void main(String[] args) {
        char arr[];
        Scanner sc= new Scanner(System.in);
        
        //Accepting the input string from user
        System.out.println("Enter the string");
        String str=sc.next();
        int len=str.length();
        arr=new char[len];
        
        //Storing the string into an array
        for(int i=0;i<len;i++){
            arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        
        //Reversing the array
        int k=len-1;
        for(int j=0; j<len/2;j++){
        	char temp=arr[j];
        	arr[j]=arr[k];
        	arr[k]=temp;
       		k--;
        }
        //Printing the reversed array
        System.out.println(Arrays.toString(arr));
        
        //Reverse string
        String str1="";
        for(int n=0;n<len;n++){
            str1+=arr[n];
        }
        
        //Printing the reversed string
        System.out.println(str1);
        sc.close();
    }
}