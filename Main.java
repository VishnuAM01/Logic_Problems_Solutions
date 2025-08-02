import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int arr[];
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the size of the array: ");
	        int size=sc.nextInt();
	        arr=new int[size];
	        
	        //Accepting numbers form user
	        System.out.println("Enter numbers: ");
	        for(int i=0;i<size;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Given array: ");
	        System.out.println(Arrays.toString(arr));
	        
	        System.out.println("Enter the window size");
	        int k=sc.nextInt();
	        
	        //Check the window size is smaller than array size.
	        if(k<=size && k>0) {
	        	
	        //Sum of first k elements
	        int win_sum=0, max_sum=0;
	        for(int j=0;j<k;j++) {
	        	win_sum+=arr[j];
	        }
	        max_sum=win_sum;
	        
	        //Sliding window to find the sum of sub-arrays
	        for(int i=0;i<size-k;i++) {
	        	win_sum=win_sum-arr[i]+arr[k+i];
	        	if(max_sum<win_sum)
	        		max_sum=win_sum;
	        }
	        System.out.println("Maximum sum of a subarray in given array is:"+max_sum);
	        }
	        else
	        	System.out.println("Invalid window size");
	        
	        sc.close();
	}
}
