package Logic_Problems_Solutions;
/*
 * Accept 5 number in an array and sort it. Accept a number from user and check if it is there in an  
array or not, please  use binary search.
 */
import java.util.*;
class Solution4 {
    public static boolean binarySearch(int arr[], int start, int end, int key){
        if(start>end)
            return false;
            
        int mid=(start+end)/2;
        if (arr[mid]==key)
            return true;
        else if (arr[mid]<key)
           return binarySearch(arr,mid+1,end,key);
        else if (arr[mid]>key)
           return binarySearch(arr,start,mid-1,key);

        return false;
    }
    public static void main(String[] args) {
        int arr[];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        arr=new int[size];
       
        System.out.println("Enter the elements into array: ");
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array :"+Arrays.toString(arr));
        System.out.println("Enter the number to be searched?");
        int key=sc.nextInt();
        
        //Sorting the array
        for(int k=0;k<size;k++){
            for(int m=k+1;m<size;m++){
            if(arr[k]>arr[m]){
                int temp=arr[k];
                arr[k]=arr[m];
                arr[m]=temp;
            }
          }
        }
        System.out.println("Sorted array :"+Arrays.toString(arr));
        
        //Binary search in array
        boolean flag=binarySearch(arr,0,size-1,key);
        if(flag==true)
         System.out.println("Given number is found in array");
        else
            System.out.println("Given number is not found in array");
        
        sc.close();
    }
}
