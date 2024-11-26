
import java.util.Scanner;

public class if_else_switch {

    public static void main(String[] args) {
        // int a = 17;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int a = sc.nextInt();

        // if(a>18) {
        //     System.out.println("You can drive");
        // } else {
        //     System.out.println("You can't drive");
        // }
        System.out.print("Enter button number: ");
        int button = sc.nextInt();
        // if(button ==1) {
        //     System.out.println("Hello");
        // } else if(button == 2){
        //     System.out.println("Namaste");
        // } else if( button == 3) {
        //     System.out.println("Bonjour");
        // } else {
        //     System.out.println("Invalid Button");
        // }        

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }

    }
}
