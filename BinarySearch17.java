//Write Java Program to perform Binary search.
//BinarySearch17

import java.util.Scanner;
import java.util.*;  

class BinarySearch17 {
    
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
        
            if (arr[mid] == x)
                return mid;
 
         
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
          
            return binarySearch(arr, mid + 1, r, x);
        }
 

        return -1;
    }
 

    public static void main(String args[])
    {
        BinarySearch17 ob = new BinarySearch17();
 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " +n+ " array elements ");
            for(int i=0; i<n; i++) 
            {   arr[i] = sc.nextInt();  }
        
        System.out.println("Enter no to find: ");
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}

