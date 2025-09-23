package Logic_Problems_Solutions;
/*
 *  Accept principal amount, rate of interest and years of investment then find the simple interest
 */
import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		int principalAmount=sc.nextInt();
		System.out.println("Enter the interest rate: ");
		float interestRate=sc.nextFloat();
		System.out.println("Enter the number of years: ");
		int years=sc.nextInt();
		
		double simpleInterest=principalAmount*years*interestRate/100;
		System.out.println("Simple interest for "+years+" years is "+simpleInterest);
		
		sc.close();
	}

}
