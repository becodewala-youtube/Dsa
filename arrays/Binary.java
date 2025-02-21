public class Binary {

  public static int BinarySearch(int numbers[],int key){
    int start =0, end = numbers.length-1;
    while(start<=end){
        int mid = (start+end )/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<=key){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return -1;
  }


  public static void main(String[] args) {
     int numbers[]={1,2,3,9,5,6,7};
     int key = 9;
     System.out.println(BinarySearch(numbers, key));
  }  
}
