public class MaxSubArray {
   
    public static void MaxSubArray(int numbers[]){

      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                currSum=0;
                for(int k=start; k<=end; k++){
                  currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                
            }
            
        }
        System.out.println("MaxSubArray"+maxSum);
    } 


    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8};
        MaxSubArray(numbers);
    }
}
