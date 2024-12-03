public class binomial {
    public static int factorial(int n) {
        int res=1;
        for(int i=1; i<=n; i++){
            res*=i;
        }
        return res;
    }
    
public static int binomialCoefficient(int n,int r) {
      int fac_n = factorial(n);
      int fac_r = factorial(r);
      int fac_n_r = factorial(n-r); 
      int binomialCoefficient = fac_n/(fac_r*fac_n_r);

      return binomialCoefficient;
}

        public static void main(String[] args) {
            
            System.out.println(binomialCoefficient(5,2));
        }
    }
    