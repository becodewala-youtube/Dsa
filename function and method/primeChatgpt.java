public class primeChatgpt {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle numbers less than 2
        if (n < 2) {
            return false;
        }
        // Handle the special case of 2
        if (n == 2) {
            return true;
        }
        // Skip even numbers greater than 2
        if (n % 2 == 0) {
            return false;
        }
        // Check divisors up to the square root of n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; // If no divisor is found, it's prime
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9));  // Output: false
        System.out.println(isPrime(7));  // Output: true
        System.out.println(isPrime(2));  // Output: true
        System.out.println(isPrime(1));  // Output: false
    }
}
