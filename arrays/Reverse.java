public class Reverse {

    public static void Reverse(int numbers[]){
        int start =0, end = numbers.length-1;
        if (start<end){
            int temp = numbers[end];
           numbers[end]= numbers[start];
           numbers[start]= temp;
           start++;
           end--;

        }
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        Reverse(numbers);
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
