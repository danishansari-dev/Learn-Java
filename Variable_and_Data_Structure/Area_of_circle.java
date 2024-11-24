import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle:");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = (3.14F)*radius*radius;
        System.out.println("Area = "+area);        

    }
}
