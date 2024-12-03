public class reverse {
    public static void main(String[] args) {
        int n= 1234;
        System.out.println("n= " + n);
        while(n>0){
            int last=n%10;
            System.out.print(last);
            n=n/10;

        }
        System.out.println("n= " + n);
    }
}
