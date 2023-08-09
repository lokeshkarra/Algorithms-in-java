/** Sorting Algorithm 4.
    Merge Sort.
    Implemented in java.
    Time complexity : O(nlogn)
    @lokeshkarra
*/

import java.util.*;
public class Main
{
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] mergeArr = new int[ei - si + 1];
        int idx1 = si; // to track left sub array
        int idx2 = mid+1; // to track rigth sub array
        int idx3 = 0; // to track merged array
        while(idx1<=mid && idx2<=ei) {
            if(arr[idx1]<=arr[idx2]) {
                mergeArr[idx3++] = arr[idx1++];
            }
            else {
                mergeArr[idx3++] = arr[idx2++];
            }
        }
        while(idx1<=mid) {  //Elements left in left sub array
            mergeArr[idx3++] = arr[idx1++];
        }
        while(idx2<=ei) {   //Elements left in right sub array
            mergeArr[idx3++] = arr[idx2++];
        }
        
        for(int i=0, j=si; i<mergeArr.length; i++, j++){
            arr[j] = mergeArr[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        
        if(si>=ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
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
        divide(arr, 0, arr.length-1);
        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
	}
}
