package Logic_Problems_Solutions;
import java.util.*;
public class SeconHighestNumberInArray1 {
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int current = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<current) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int max_indx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i])
					max_indx=j;
			}
			int temp= arr[max_indx];
			arr[max_indx]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int []arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {1,4,8,3,9,5,7,6,3,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int len=arr.length;
		System.out.println(arr[len-2]);
		
		/*Another way => Insertion Sort*/
		System.out.println("Insertion sort");
		insertionSort(arr);
		
		/*Selection sort*/
		System.out.println("Selection Sort");
		selectionSort(arr);
		
		/*Bubble sort*/
		System.out.println("Bubble Sort");
		bubbleSort(arr);
	}

}
