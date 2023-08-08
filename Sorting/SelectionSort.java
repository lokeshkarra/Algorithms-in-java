/** Sorting Algorithm 2.
    Selection sort
    Implemented in Java.
    Time complexity : O(n^2)
    @lokeshkarra
*/

import java.util.*;
public class Main {
    
    public static void sort(int[] arr){
        int n = arr.length;
        int sidx;   // small element index
        int temp;
        for(int i=0; i<n-1; i++){
            sidx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    sidx = j;
                }
            }
            
            temp = arr[i];
            arr[i] = arr[sidx];
            arr[sidx] = temp;
            
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
