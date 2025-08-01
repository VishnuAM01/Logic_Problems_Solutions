/*
 *    Accept 5 number in an array, accept a number from user and check if given number is there in  
an array or not
 */
import java.util.*;
class Solution2 {
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
        
        //Linear search in array
        boolean flag=false; int index=0;
        for(int j=0;j<size;j++){
            if(arr[j]==key){
            flag=true;
            index=j;
            break;
            }
        }
        if(flag==true)
            System.out.println("Element Found!! Index position is -> "+index);
        else
            System.out.println("The given number, "+key+" not found in the array!!");
        
        sc.close();
    }
}
