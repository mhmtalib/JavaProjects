


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class random_numbers_with_sorting {
    public static void main(String[] args){
        System.out.println("**********************************");
        
        //get size of array
        System.out.print("Enter the size of the array: ");
        Scanner scam = new Scanner(System.in);
        int size = scam.nextInt();
        
        
        //declare array
        int arr[] = new int[size];
        
        //Fill the array with random numbers
        Random rand = new Random();
        
        for(int i=0; i<arr.length; i++){
            int m = rand.nextInt(1000);
            arr[i] = m;
        }
        //print unsorted array
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        
        //sort the array
        bubbleSort(arr);
        
        //print sorted array
        System.out.println("Sorted array: "+Arrays.toString(arr));
       
        //read the key/value from user
        System.out.print("Write a value to see whether the value is present in the array or not: ");
        int x = scam.nextInt();
        scam.close();
        
        //do binary search
        int result = binarySearch(arr, 0, size-1, x);
        
        if(result==-1){
            System.out.println("Element not present");
            System.out.println("**********************************");

        }else{
            System.out.println("Element found at index: " + result);
            System.out.println("**********************************");

        }
    }
    
    //bubbleSort
    static void bubbleSort(int arr[]){
        int i, j, temp;
        boolean swapped=false;
        
        do
        {
        //for each pass	
        for(i=0; i<arr.length-1; i++)
	        {        		
	            swapped = false;
	            //scan the array
	            for(j=0; j<arr.length-i-1; j++)
	            	{
	                if(arr[j]>arr[j+1])
	                	{
	                    temp = arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                    swapped= true;
	                	}
	            	}	            
	        }
        }while(swapped);
    }
   
    //binarySearch
    static int binarySearch(int arr[], int lhs, int rhs, int x){
        if(rhs>=lhs){
            int mid = lhs + (rhs-lhs)/2;
            // If the element is present at the
            // middle itself
            if(arr[mid]==x){
                return mid;
            }  
            // If element is smaller than mid, then it can only be 
            // present in left subarray
            if(arr[mid] > x){
                return binarySearch(arr, lhs, (mid-1), x);
            }    
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, (mid+1), rhs, x);
        }
        // We reach here when element is not present in array
        return -1;
    }
}
        


