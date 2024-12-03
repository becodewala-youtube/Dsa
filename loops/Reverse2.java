public class Reverse2 {
    public static void main(String[] args) {
        int n= 1234;
        int rev = 0;
        System.out.println("n= " + n);
        while(n>0){
            int last=n%10;
            rev=(rev*10)+last;
            n=n/10;

        }
        System.out.println(rev);
    }
}
