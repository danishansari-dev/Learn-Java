import java.util.Scanner;
public class arrayManipulation {
    
    public static int targetSum(int arr[], int target) {
        target = 7;
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int tripletSum(int arr[], int target) {
        int ans= 0;
        for(int i=0; i<arr.length; i++) { // first number
            for(int j=i+1; j<arr.length; j++) {  //Second number
                for(int k=j+1; k<arr.length; k++) { // third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static int uniqueElement(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int unique = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != -1) {
                unique = arr[i];
            }
        }
        return unique;
    }

    public static int max(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public static int SecondMax(int arr[]) {
        int mx = max(arr);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = max(arr);
        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n+ " elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.print("Enter target number: ");
        // int target = sc.nextInt();
        // System.out.println("Target sum is = " +targetSum(arr, target));
        // System.out.println("Triplet sum is = " +tripletSum(arr, target));
        // System.out.println("Unique elements is = " +uniqueElement(arr));
        System.out.println("Max element is = " +max(arr));
        System.out.println("secMax element is = " +SecondMax(arr));
    }
}
