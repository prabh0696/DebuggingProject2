//Below this is In-Built Scanner Library
import java.util.Scanner;

/**
 * This is the Code to perform Binary Search.
 * @author hp
 * @version 2020.1.2
 */
public class BinarySearch {
    /*
     Scanner is to get the input from USER at Run Time
     */
    static Scanner input=new Scanner(System.in);

    /**
     * @param args the command line arguments
     * This Is Main Method in which length of array is asked from user.
     * Also Array is declared and
     * BinarySearch() Function is Called in this Main Method
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the length of array:");
        int n=input.nextInt();
        int[] arr1=new int[n];
        BinarySearch(arr1);
    }

    /**
     *
     * @param arr1 is array in which elements will be stored
     * BinarySearch() is the function in which elements are stored,
     * All other logic like search Element is done in this Function;
     */
    static void BinarySearch(int arr1[]){

        int first=0,last;
        last=arr1.length-1;
        int find;//find variable is used to search the element that user wants to find.
        System.out.println("Enter elements of array:");
        /**
         * This for loop is used to ask user to
         * enter elements into Array During Run Time.
         */
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("BINARY SEARCH");
        /**
         * This for loop is used to Display Array
         */
        for(int i=0;i<arr1.length;i++){
            System.out.println("Array at index ["+i+"] is:"+arr1[i]);
        }

        System.out.print("Enter Element to found :");
        find=input.nextInt();
        /**
         *Below is the Logic To Search the Requested Element in Array.
         */
        int middle = (first + last)/2;
        while( first <= last ){
            if ( arr1[middle] < find ){
                first = middle + 1;
            }else if ( arr1[middle] == find ){
                System.out.println("Element is searched at index: " + middle);
                break;
            }else{
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        /*
        This is the if Loop to display Message if first> last then Element is not found.
         */
        if ( first > last ){
            System.out.println("Element not found!");
        }


    }
}
