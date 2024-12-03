public class primeRange {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i < n-1; i++){  /* for n>2  and for optimized way do underoot of n*/
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeInRange(20);
    }
}

