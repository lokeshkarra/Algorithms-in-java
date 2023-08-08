/** Sorting Algorithm 3.
    Insertion Sort.
    Implemented in java.
    Time complexity : O(n^2)
    @lokeshkarra
*/

import java.util.*;
public class InsertionSort {
    
    public static void sort(int[] arr){
        int n = arr.length;
        //[3, 2, 1]
        int temp;   // element which we are going to to insert in sorted part
        for(int i=1; i<n; i++){  // loop for unsorted part
            temp = arr[i];
            int j = i-1;
            while(j>=0 && temp<arr[j]){  // loop for sorted part
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = temp;
            
        }
        for(int k=0; k<arr.length; k++){
                System.out.print(arr[k]+" ");
            }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements to be sorted : ");
        int n = sc.nextInt();
	  System.out.println("Enter Elements : ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            int el = sc.nextInt();
            arr[i]=el;
        }
        sc.close();
        System.out.println("Sorted Elements are : ");
        sort(arr);
    }
    
}
