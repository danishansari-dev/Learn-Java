import java.util.*;

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
    }
    
    public static int[] smallestAndLargestElement(int[] arr) {
        // Sorting the array
        Arrays.sort(arr);
        
        // Getting the smallest and largest elements
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 5};
        int x = 3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " +n+ " elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Count of "+x+" is : " + countOccurance(arr, x));
        System.out.println("Last occurance of "+ x+ " is "+ lastOccurance(arr, x));
        System.out.println("Strictly Greater than then value " +x+ " is " +lastOccurance(arr, x));
        System.out.println("is shorted? " + isShorted(arr));
        sort(arr);
        
        System.out.println("Smalest: " + smallestAndLargestElement(arr[0]));
        System.out.println("Largest: " + smallestAndLargestElement(arr[1]));
    }

}
