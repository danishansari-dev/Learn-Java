import java.util.*;

public class Syntax_with_parameters {

    public static int calculateSum(int num1, int num2) { // Parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = calculateSum(a, b); // Arguments or actula parameters
        System.out.println("Sum is " + sum);
    }
}