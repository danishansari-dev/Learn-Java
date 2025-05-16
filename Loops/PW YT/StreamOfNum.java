import java.util.Scanner;
public class StreamOfNum {
    public static void main(String[] args) {
        
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        while(num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
        sc.close();

    }
    
}
