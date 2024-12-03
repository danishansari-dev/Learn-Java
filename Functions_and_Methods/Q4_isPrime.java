public class Q4_isPrime {
    // public static boolean isPrime(int n){

    //     if(n==1) return false;
    //     if(n==2) return false;

    //     for(int i=2; i<=n-1; i++) {
    //         if(n%i==0) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    // Optimized function
    public static boolean isPrime(int n) {
        if(n==2 || n==1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Number isPrime? --> "+ isPrime(5));
    }
    
}
