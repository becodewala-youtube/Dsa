public class SubArray {
   
    public static void SubArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                for(int k=start; k<=end; k++){
                   System.out.print(numbers[k]+"");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

// i think worng hai beacuse it printing whole array also
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8};
        SubArray(numbers);
    }
}
