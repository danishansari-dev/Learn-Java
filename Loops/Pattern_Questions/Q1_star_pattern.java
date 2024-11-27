public class Q1_star_pattern {
    public static void main(String[] args) {
        // for(int i=1; i<=4; i++) {
        //     for (int j=1; j<=i; j++)
        // }
        for(int line=1; line<=4; line++) {
            // One line
            for(int star=1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
