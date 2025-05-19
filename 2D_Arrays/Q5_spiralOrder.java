import java.util.Scanner;

public class Q5_spiralOrder {

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println("");
        }
    }

    public static void printSpiralOrder(int matrix[][], int r, int c) {
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = r-1;
        int totalElements = 0;

        while (totalElements < r * c) {

            // toRow -> leftCol - rightCol
            for(int j=0; j<=rightCol; j++) {
                System.out.print(matrix[topRow][j] + " ");
            }
            topRow++;

            // rightCol -> topRow - bottomRow
            for(int i=0; i<=bottomRow; i++){
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // bottomRow -> rightCol - leftCol
            for(int j=rightCol; j>=leftCol; j--){
                System.out.print(matrix[bottomRow][j] + " ");
            }
            bottomRow--;

            // leftCol -> bottomRow - topRow
            for(int i=bottomRow; i>=topRow; i--) {
                System.out.print(matrix[i][leftCol] + " ");
            }
            leftCol++;
        }
    }

    public static void main(String agrs[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        
    }
}
