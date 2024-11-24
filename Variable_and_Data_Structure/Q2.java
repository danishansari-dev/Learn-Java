import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /* In a program, input the side of a square. You have to output the area of the
            square.
            (Hint : area of a square is (side x side))
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        float side = sc.nextFloat();
        System.out.println("Are of square = "+side*side);
    }
    
}
