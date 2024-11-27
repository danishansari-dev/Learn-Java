import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Check If A number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n==2) {
            System.out.println(n+" is prime");
        } else {
            for(int i=2; i<=n-1;){
                if(n%i==0 || n==1) {
                    isPrime = false; // n is a multiple of i (i not equals to 1 or n)
                }
            }
            if(isPrime==true) {
                System.out.println(n+" is prime");
            } else {
                System.out.println(n+" is not prime");
            }
        }

    }
}
