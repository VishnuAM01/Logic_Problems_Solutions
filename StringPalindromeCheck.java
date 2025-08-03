import java.util.*;
public class StringPalindromeCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Accepting the input from user
		System.out.println("Enter the word: ");
		String str=sc.next().toLowerCase();
		
		int len=str.length();
		int k=len-1; boolean flag=true;
		//Checking the word is palindrome or not
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(k)) {
				flag=false;
				break;
			}
			k--;
		}
		
		//Printing the output
		if(flag!=true)
			System.out.println("Given word is not a Palindrome");
		else
			System.out.println("Given word is a Palindrome");
		
		sc.close();
	}
}
