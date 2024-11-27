import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // Print Reverse of a number
        // int num = 12345;
        // while(num>0) {
        //     int lastDigit = num%10;
        //     System.out.print(lastDigit);
        //     // num = num/10;
        //     num /= 10;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int n = sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n /=10;
            
        }
    }
}