/*
*Accept a sentence from user and count number of words
*/
import java.util.*;
public class CountTheTotalWords {
	public static void main(String[] args) {
        char arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String line=sc.nextLine();
        System.out.println(line);
        int len = line.length();
        System.out.println(len);
        arr=new char[len];
        /*
         * Iterating through the sentence array to find the <space> and dot(.).
         */
        int count=0;
        for(int k=0;k<len;k++){
                arr[k]=line.charAt(k);
            }
            char sp=' ', dt='.';
        for(int i=0;i<len;i++){
            if(arr[i]==sp  || arr[i]==dt)
                count++;
        }
        System.out.println("The given sentence contains "+count+" words");
        
        sc.close();
    }
}