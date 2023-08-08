/** Sorting Algorithm 1.
    Implemented in java.
    Time complexity : O(n^2)
    @lokeshkarra
*/

import java.util.*;
public class Bubble {
    
    public static void sort(int[] arr){
	//This method sort elements in ascending order
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            
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
