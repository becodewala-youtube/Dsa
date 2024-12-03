public class factorial {
public static int fact(int n) {
    int res=1;
    for(int i=1; i<=n; i++){
        res*=i;
    }
    return res;
}

    public static void main(String[] args) {
        int result=fact(5);
        System.out.println(result);
    }
}
