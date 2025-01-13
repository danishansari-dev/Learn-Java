
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
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 5, 6, 5};
        int x = 5;
        System.out.println("Count of "+x+" is : " + countOccurance(arr, x));


    }
    
}
