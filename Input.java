import java.util.*;

public class Input  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is: "+sum);
    }
}
// if we use next it will take and print only one word 
// to print word after spaces use nextline
// nextInt to take input as integer
//similarly nextFloat 