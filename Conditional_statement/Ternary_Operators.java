import java.util.*;

public class Ternary_Operators {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to identify odd or even: ");
        int num = sc.nextInt();

        String type = (num % 2) ==0? "Even" : "Odd";
        System.out.println("The number "+num+" is "+type);
    }
}
