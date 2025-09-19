package Logic_Problems_Solutions;
import java.util.Scanner;

public class CheckEvenOrOddWithoutModuloOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		/*if last bit of number is 1, then 1 × 1 = 1	Odd number has 1 in least bit position
		 * if last bit of number is 0, then 0 × 1 = 0	Even number has 0 in least bit position
		 */
		
		if( (num & 1)==1)
			System.out.println("Given number is even");
		else
			System.out.println("Given number is odd");
		sc.close();
	}

}
