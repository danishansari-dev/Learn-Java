import java.util.*;
public class Q3_RotateMatrix {
    
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeInPlace(int matrix[][], int r, int c) {
        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverseArray(int arr[]) {
        int i=0, j = arr.length-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void RotateMatrix(int matrix[][], int r, int c){
        // Transpose
        transposeInPlace(matrix, r, c);
        // reverse
        for(int i=0; i<matrix.length; i++) {
            reverseArray(matrix[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number or rows & columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][] = new int[r][c];

        System.out.print("Enter " + r*c + " elements: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix:");
        printMatrix(mat);

        System.out.println("Rotate: ");
        RotateMatrix(mat, r, c);
        printMatrix(mat);


    }
    
}
