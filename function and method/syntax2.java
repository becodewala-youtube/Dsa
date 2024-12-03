import java.util.Scanner;

public class syntax2 {
        
    public static int calculateSum(int num1, int num2) {  //parameters
        int sum = num1 + num2;
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum=calculateSum(a,b);//arguments
        System.out.println("sum = " + sum);
    }
}