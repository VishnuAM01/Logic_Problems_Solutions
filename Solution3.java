/*
 *  Accept 10 number in an array. Display all even number at the beginning and all Odd at the end.  
Use only one loop
 */
import java.util.*;
class Solution3 {
    public static void main(String[] args) {
        int arr[],b_arr[];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        arr=new int[size];
        b_arr=new int[size];
        System.out.println("Enter the elements into array: ");
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array :"+Arrays.toString(arr));
        
        //Segregating even and odd numbers
        int pos=0, epos=size-1;
        for(int j=0;j<size;j++){
            if(arr[j]%2==0)
                b_arr[pos++]=arr[j];
            else
                b_arr[epos--]=arr[j];
            }
        System.out.println("Segregated array :"+Arrays.toString(b_arr));
        
        sc.close();
    }
}