import java.util.*;

public class CheckingPalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Accepting the number from user
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int store_num=num;
		int num2=0;
		
		//Reversing the number
		while(num>0) {
			int reminder=num%10;
			num2=num2*10+reminder;
			num=num/10;
		}
		
		//Checking the number whether palindrome or not
		if(num2==store_num) {
			System.out.println("Given number is a palindrome number");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		
		sc.close();
	}

}
