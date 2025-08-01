/*
 * Segregate positive and negative integers in linear time   
Given an array of positive and negative integers,   
. The output should print all negative numbers, followed   
by all positive numbers.   
For example,   
Input: [ 1 9 ,  - 1 3 ,  1 5 ,  - 1 2 ,  - 1 ,  8 - 1 6 , 1,  3]   
Output: [ - 1 3 ,  - 1 2 ,  - 1 ,  8 - 1 6 ,  1 5 ,  1 9 , 1,  3   
  
After showing above output copy this data into another array and sort it.  
 */

import java.util.*;
class Solution1 {
    public static void main(String[] args) {
        int arr[], b_arr[];
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
        
        //Segregating negative & positive numbers
        int pos=0, epos=size-1;
        for(int j=0;j<size;j++){
            if(arr[j]<0)
                b_arr[pos++]=arr[j];
            else
                b_arr[epos--]=arr[j];
        }
        System.out.println("Segregated array :"+Arrays.toString(b_arr));
        
        //Ordering the array in ascending order
        for(int k=0;k<size;k++){
            for(int m=k+1;m<size;m++){
            if(b_arr[k]>b_arr[m]){
                int temp = b_arr[k];
                b_arr[k]=b_arr[m];
                b_arr[m]=temp;
            }
        }
    }
    System.out.println("Ordered array :"+Arrays.toString(b_arr));
    sc.close();
    }
}