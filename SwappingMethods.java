package Logic_Problems_Solutions;
import java.util.Scanner;

public class SwappingMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		
		System.out.println("Before swapping, num1=> "+num1+" num2=> "+num2);
		usingAddition(num1, num2);
		usingMultiplication(num1,num2);
		usingBitWiseXOR(num1,num2);
		sc.close();
	}

	private static void usingBitWiseXOR(int num1, int num2) {
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("After swapping using BitWiseXOR method, num1=> "+num1+" num2=> "+num2);
	}

	private static void usingMultiplication(int num1, int num2) {
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println("After swapping using Multiplication method, num1=> "+num1+" num2=> "+num2);
	}

	private static void usingAddition(int num1, int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping using Addition method, num1=> "+num1+" num2=> "+num2);
		
	}

}
