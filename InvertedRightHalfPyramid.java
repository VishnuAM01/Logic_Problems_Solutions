import java.util.*;

public class InvertedRightHalfPyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		int count=0;
		
		for(int i=row;i>=1;) {
			//Printing the stars
			if(count<i) {
				System.out.print("*");
				count++;
				continue;
			}
			//Jumping to next line
			if(count==i) {
				System.out.println();
				count=0;
				i--;
			}
		}
		sc.close();
	}
}
