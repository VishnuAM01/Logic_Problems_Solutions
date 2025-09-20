package Logic_Problems_Solutions;
/*
 * Create a Fibonacci Triangle
 */

import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci_Triangle {
	static int k=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Accept the number of rows from user
		System.out.println("Enter the number of rows: ");
		int row=sc.nextInt();
		sc.close();
		
		//Create the array with required fibonacci numbers
		int n= sum(row);
		//System.out.println(n);
		int[] fib=new int[n];
		
		//Check the conditions and fill the array
		if(n==1)
			fib[0]=0;
		if(n>1) {
			fib[0]=0;
			fib[1]=1;
		}
		for(int i=2;i<n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		//System.out.println(Arrays.toString(fib));
		
		//Printing row-wise
		for(int j=0;j<=row;j++) {
			//Print the spaces in each row
			for(int m=row;m>j;m--)
				System.out.print(" ");
			//Print the fibonacci numbers
			int p=j;
			while(p>0) {
				System.out.print(fib[k++]+" ");
				p--;
			}
			//Next row
			System.out.println();
		}
	}
	
	//Calculating the size of fibonacci series array
	private static int sum(int row) {
		while(row>1) {
			return row+sum(row-1);
		}
		return 1;
	}
}
