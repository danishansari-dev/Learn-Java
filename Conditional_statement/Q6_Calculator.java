import java.util.*;

public class Q6_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.print(a+""+operator+""+b+" = "+(a+b));
                break;
            case '-': System.out.println(a+""+operator+""+b+" = "+(a-b));
                break;
            case '*': System.out.print(a+""+operator+""+b+" = "+(a*b));
                break;
            case '/': System.out.print(a+""+operator+""+b+" = "+(a/b));
                break;
            case '%': System.out.print(a+""+operator+""+b+" = "+(a%b));
                break;
            default: System.out.println("Wrong operator");
        }
    }
    
}
