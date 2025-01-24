import java.util.Arrays;
import java.util.Scanner;

public class basic_programs {
    public static int countOccurance(int arr[], int x) {
        int count =0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static int lastOccurance(int arr[], int x) {
        // for(int i=arr.length-1; i>=0; i--) {
        //     if(arr[i] == x) {
        //         return i;
        //     }
        // }
        // return -1;
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    // chech wheather arr is shorted or not
    public static boolean isShorted(int arr[]) {
        boolean check = true;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    // Sort function 
    public static void sort(int arr[]) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    // Count the number of elements strictly greater than value x.
    public static int strictlyGreater(int arr[], int x) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 5};
        int x = 3;

        System.out.println("Count of "+x+" is : " + countOccurance(arr, x));
        System.out.println("Last occurance of "+ x+ " is "+ lastOccurance(arr, x));
        System.out.println("Strictly Greater than then value " +x+ " is " +lastOccurance(arr, x));
        System.out.println("is shorted? " + isShorted(arr));
        System.out.println(sort(arr));

    }

}
