//A. Find the second largest element in an array.
//SecoLargestNumber15

import java.util.Scanner;
import java.util.*;  

public class SecoLargestNumber15 {  
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter " +n+ " array elements ");
      for(int i=0; i<n; i++) {
         arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      for(int i=n-1;i>1;i--){
       if(arr[i]!=arr[i-1]){
            System.out.println(arr[i-1]+" is second largest element");
            break;
        }
    }
    
  }
}
