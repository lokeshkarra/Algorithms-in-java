/** Sorting Algorithm 4.
    Merge Sort.
    Implemented in java.
    Time complexity : O(nlogn)
    @lokeshkarra
*/

import java.util.*;
public class QuickSort
{
    public static int partion(int[] arr, int low, int high) {
        int p = arr[high];   // pivot
        int i=-1;     // to track elements which are less than pivot
        for(int j=0; j<high; j++){
            if(arr[j]<p) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = p;
        arr[high] = temp;
        return i;
    }
    public static void sort(int[] arr, int low, int high){
        
        if(low<high) {
            int idx = partion(arr, low, high);
            sort(arr, low, idx-1);
            sort(arr, idx, high);
        }
    }
    
    
	public static void main(String[] args) {
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
        sort(arr, 0, arr.length-1);
        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
	}
}
