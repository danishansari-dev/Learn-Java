
import java.util.*;

public class Q3_Income_tax_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income >= 1000000) {
            tax = (int) (income * 0.2f);
        } else {
            tax = (int) (income * 0.3f);
        }
        System.out.println("The Tax is " + tax);
    }
}
