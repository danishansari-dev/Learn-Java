public class basicProgramsL17 {

    public static void swap(int a, int b) {
        System.out.println("Values before swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println("After swap:");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }
    
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Swap Without Temp ");
        System.out.println("Values before swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
        System.out.println("Values after swap: ");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }

    public static int[] rotateArray(int arr[]) {
        
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of an array: ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];
        // System.out.print("Enter " +n+ " elements: ");
        // for(int i=0; i<arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        int a = 9;
        int b = 3;
        // swap(a, b);
        swapWithoutTemp(a,b);

        // int arr[] = {1, 2, 3, 4, 5,6};
    }
}
