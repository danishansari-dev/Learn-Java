import java.util.Scanner;
public class twoPointersL18 {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

public static void swapInArray(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;    
}

// public static void sortZeroesAndOnes(int arr[]) {
//     int zeroes = 0;
//     for(int i=0; i<arr.length; i++) {
//         if(arr[i] == 0) {
//             zeroes++;
//         }
//     }

//     for(int i=0; i<arr.length; i++) {
//         if(i<zeroes) {
//             arr[i] = 0;
//         } else {
//             arr[i] = 1;
//         }
//     }
// }

public static void sortZeroesAndOnes(int arr[]) {
    int left = 0, right = arr.length-1;

    while(left<right) {
        if(arr[left] == 1 && arr[right] == 0) {
            swapInArray(arr, right, left);
            left++;
            right--;
        }
        if(arr[left] == 0) {
            left++;
        }
        if(arr[right] == 1) {
            right--;
        }
    }
}

public static void sortEvenOdd(int arr[]) {
    int left = 0, right = arr.length-1;

    while (left < right) {
        if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
            swapInArray(arr, left, right);
            left++;
            right--;
        }
        if(arr[left] % 2 == 0) {
            left++;
        }
        if(arr[right] % 2 == 1) {
            right--;
        }
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // sortZeroesAndOnes(arr);
        sortEvenOdd(arr);
        printArray(arr);
    }
    
}
