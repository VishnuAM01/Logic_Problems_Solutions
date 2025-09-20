package Logic_Problems_Solutions;
import java.util.Scanner;

public class PolygonTest {
	public static void main(String[] args) {
		int sum=0;
		int arr[] = new int[4];
		boolean polygon=true;
		boolean square=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of four sides: ");
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Length of sides: ");
		for(int i=0;i<4;i++) {
			System.out.print(arr[i]+", ");
		}
		sc.close();
		for(int j=0;j<4;j++) {
			sum+=arr[j];
		}
		for(int k=0;k<4;k++) {
			if(arr[k]>sum-arr[k]) {
				polygon=false;
				break;
			}
		}
		for(int m=1;m<4;m++) {
			if(arr[0]!=arr[m])
				square=false;
		}
		System.out.println();
		if(polygon != false)
			System.out.println("Polygon = 1");
		else
			System.out.println("Polygon = 0");
		
		if(square !=false)
			System.out.println("Square = 1");
		else
			System.out.println("Square = 0");	
	}
}
