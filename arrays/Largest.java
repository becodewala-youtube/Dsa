import java.util.*;
public class Largest {

    public static int Largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("samallest "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]= {2,3,4,5,6,7,8,9,10};
        System.out.println("Largest: " + Largest(numbers));
    }
}
