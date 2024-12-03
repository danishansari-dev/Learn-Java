public class function_overloading {
    // function to calculate sum of 2 nums
    public static int sum(int a, int b) {
        return a+b;
    }

    // function to calucate sum of 3 nums
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 8));
        System.out.println(sum(5, 1, 6));
    }
}
