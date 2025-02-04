import java.util.Scanner;
public class prefixSumL19 {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int arr[]) {
        int n = arr.length;
        // int pref[] = new int[n];
        // pref[0] = arr[0];

        for(int i=1; i<n; i++) {
            // pref[i] = pref[i-1] + arr[i];
            arr[i] = arr[i-1] + arr[i];
        }
        // return pref;
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // int arr[] = new int[n];
        int arr[] = new int[n+1];

        System.out.print("Enter " +n+ " elements: ");
        for(int i=1; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans[] = prefixSum(arr);
        // printArray(ans);

        int prefSum[] = prefixSum(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter range: ");
        while(q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum: " + ans);
        }
    }
}

