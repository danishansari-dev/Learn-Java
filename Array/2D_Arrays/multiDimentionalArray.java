
public class multiDimentionalArray {

    public static void printArray(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int arr2[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printArray(arr2);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of rows: ");
        // int r = sc.nextInt();
        // System.out.print("Enter number of columns: ");
        // int c = sc.nextInt();

        // int arr[][] = new int[r][c];

        // System.out.print("Enter " + r*c + " elements: ");
        // for(int i=0; i<arr.length; i++) {
        //     for (int j=0; j<arr[i].length; j++) {
        //         arr[r][c] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        // printArray(arr);
    }
}