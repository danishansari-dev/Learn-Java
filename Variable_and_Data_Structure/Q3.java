
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        /*
         * Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
            an eraser. You have to output the total cost of the items back to the user as their bill.
            (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of pencil, pen and erase: ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = (pencil + pen + eraser);
        float gst = cost + cost * 0.18f;
        System.out.println("Total cost = " + gst);

        /*
        Q5: will it give error?
        int $ = 4;
        System.out.println($);
        
            No, the statement will not give any error.
            NamesofvariablesarecalledidentifiersinJava. Identifierrulesays, identifierscanstartwith
            any alphabet or underscore (“_”) or dollar (“$”).
            According to the rule the given variable name is a valid identifier.
         */
    }
}
