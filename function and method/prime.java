public class prime {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i < n-1; i++){  /* for n>2  and for optimized way do underoot of n*/
            if(n%i == 0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}

