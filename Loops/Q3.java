import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to calculate sum: ");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while(i<=n) {
            // sum = sum +i
            sum +=i;
            i++;
        }
    System.out.println("The sum is "+sum);
    }
    
}