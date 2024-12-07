public class largestNumber {
    public static int getLargest(int numbers[]) {
        int largeest = Integer.MIN_VALUE; // - infinity
        int smalest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]>largeest) {
                largeest = numbers[i];
            }
            if(numbers[i]<smalest) {
                smalest = numbers[i];
            }
        }
        System.out.println("Smalest number is : " + smalest);
        return largeest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 4};
        // getLargest(numbers);
        System.out.println("Largest number is: "+ getLargest(numbers));
    }
    
}
