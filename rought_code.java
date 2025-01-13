
public class rought_code {

    public static int linearSearch(int arr[], int key) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestNum(int arr[], int key) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
            if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is "+ smallest);
        return largest;

    }
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,6,8,3,9,10};
        int key = 9;

        System.out.println("largest value is: " + largestNum(arr, key));

        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}