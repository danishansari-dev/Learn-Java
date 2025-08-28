import java.util.Scanner;

public class Q6_spiralOrder2 {
    
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println("");
        }
    }

    public static int[][] generateSpiralMatrix(int n) {

        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int num = 1;

        while (num <= n * n) {

            // topRow -> leftCol - rightCol
            for(int j=leftCol; j<=rightCol && num <= n*n; j++) {
                matrix[topRow][j] = num++;
            }
            topRow++;
            
            // rightCol -> topRow - bottomRow
            for(int i=topRow; i<=bottomRow && num <= n*n; i++){
                matrix[i][rightCol] = num++;
            }
            rightCol--;
            
            // bottomRow -> rightCol - leftCol
            for(int j=rightCol; j>=leftCol && num <= n*n; j--){
                matrix[bottomRow][j] = num++;
            }
            bottomRow--;
            
            // leftCol -> bottomRow - topRow
            for(int i=bottomRow; i>=topRow && num <= n*n; i--) {
                matrix[i][leftCol] = num++;
            }
            leftCol++;
        }
    return matrix;
    }

    public static void main(String args[]) {

        // user matrix input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
