import java.util.Scanner;

// Array Introduction: Declare, initialize, and access elements in an array
public class arrayIntro {
    public static void main(String[] args) {

        // int marks[] = new int[50];
        // int moreNumbers[] = {4, 5, 6};
        // String fruits[] = {"apple", "mango", "orange"};
        // System.out.println(marks[0]);
        // System.out.println(moreNumbers[1]);
        // System.out.println(fruits[1]);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];
        System.out.print("Enter the element of the array: ");
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }


        // Output
        for(int i=0; i<size; i++) {
            System.out.println(arr[i]);
        }

    }
    
}
