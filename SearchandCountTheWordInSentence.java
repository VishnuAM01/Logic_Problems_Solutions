package Logic_Problems_Solutions;
import java.util.*;
/*
*Accept a sentence from user , accept a word from user and count occurrence of that word
 Test1
: welcome to VITA. VITA is CDAC centre. KAVITA is good mentor  //Vita 3 time
*/
public class SearchandCountTheWordInSentence {
	public static void main(String[] args) {
		/*
		 * Two character arrays. One to store the sentence another one is to store the searching word.
		 */
        char arr[],brr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String line=sc.nextLine().toLowerCase();
        System.out.println(line);
        int len = line.length();
        System.out.println(len);
        /*
         * Stroing the sentence into the array
         */
        arr=new char[len];
        for(int k=0;k<len;k++){
                arr[k]=line.charAt(k);
            }
        /*
         * Accepting and storing the word to be searched.
         */
        System.out.println("Enter the word to be searched? ");
        String src=sc.next().toLowerCase();
        int len1 = src.length();
        brr=new char[len1];
        for(int k=0;k<len1;k++){
                brr[k]=src.charAt(k);
            }
        /*
         * Checking the each letters of the word with sentence array for matching sub-string.
         */
        int count=0;
        for(int i=0;i<=len-len1;i++){
          boolean check=true;
            for(int j=0;j<len1;j++){
              if(arr[j+i]!=brr[j]){
                check=false;
                break;
              }
            }
                if(check!=false)
                    count++;
        }
        
        if(count!=0)
            System.out.println("The given word occurs "+count+" times.");
        else
        System.out.println("The given word is not there in the sentence");
        
        sc.close();
    }
}
