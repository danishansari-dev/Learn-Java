public class largestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        int smalest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]>largest) {
                largest = numbers[i];
            }
            if(numbers[i]<smalest) {
                smalest = numbers[i];
            }
        }
        System.out.println("Smalest number is : " + smalest);
        return largest;
    }

    public static void main(String[] args) {
        
        int numbers[] = {1, 2, 6, 3, 4};
        // getLargest(numbers);
        System.out.println("Largest number is: "+ getLargest(numbers));
    }
    
}
