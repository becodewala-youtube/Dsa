public class binary2decimal {

    public static void BintoDec(int binNum){
        int Mynum = binNum;
        int pow=0;
        int DeciNum=0;
        while (binNum>0){
            int lastDigit=binNum%10;
            DeciNum=DeciNum+(int)(lastDigit*Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
            

        }
       
      System.out.println("decimal of"+Mynum+" = "+ DeciNum);
    }


    public static void main(String[] args) {
         BintoDec(111);
    }
}
