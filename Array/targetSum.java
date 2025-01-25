import java.util.Scanner;
public class targetSum {
    
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n+ " elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target number: ");
        int target = sc.nextInt();
        System.out.println(targetSum(arr, target));

    }
}