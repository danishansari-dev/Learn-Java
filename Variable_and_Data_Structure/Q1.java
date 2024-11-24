import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /* Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
            these 3 numbers.
            (Hint : Average of N numbers is sum of those numbers divided by N)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers (A,B,C): ");
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float avg = (A+B+C)/3;
        System.out.println("Avg of numbers you Enter: "+avg);
    }
    
}
