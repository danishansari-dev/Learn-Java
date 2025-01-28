public class basicProgramsL17 {

    public static void swap(int a, int b) {
        System.out.println("Values before swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println("After swap:");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }
    
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Swap Without Temp ");
        System.out.println("Values before swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
        System.out.println("Values after swap: ");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        
        // int j = 0;
        // Traverse original array in reverse direction
        // for(int i=n-1; i>=0; i--) {
        //     ans[j++] = arr[i];
        // }

        int i=n-1, j=0;
        while(i>=0) {
            ans[j++] = arr[i--];
        }
        return ans;
    }

    public static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void reverseArray2(int arr[], int i, int j) {
        while(i<j) {
        swapInArray(arr, i, j);
        i++;
        j--;
        }
    }

    public static void rotateInPlace(int arr[], int k){
        int n = arr.length;
        k = k%n;
        reverseArray2(arr, 0, n-k-1);
        reverseArray2(arr, n-k, n-1);
        reverseArray2(arr, 0, n-1);
    }

    public static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j =0;

        for(int i=n-k; i<n; i++) {
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }




    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of an array: ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];
        // System.out.print("Enter " +n+ " elements: ");
        // for(int i=0; i<arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int a = 9;
        // int b = 3;
        // swap(a, b);
        // swapWithoutTemp(a,b);
        int arr[] = {1, 2, 3, 4, 5, 6};
        // int ans[] = reverseArray(arr); // initialize it coz it is returning value
        // printArray(ans);

        // reverseArray2(arr);
        // printArray(arr);
        
        // System.out.println("Original Array");
        // printArray(arr);

        int k = 2;
        // System.out.println("Array after rotate");
        // int ans[] = rotate(arr, k);
        // printArray(ans);

        rotateInPlace(arr, k);
        printArray(arr);

    }
}
