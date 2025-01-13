
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
    public static int countGreaterValues(int arr[], int x) {
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 3;

        System.out.println("Count of "+x+" is : " + countOccurance(arr, x));
        System.out.println("Last occurance of "+ x+ " is "+ lastOccurance(arr, x));
        System.out.println(countGreaterValues(arr, x));
    }
    
}
