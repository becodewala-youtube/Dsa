public class decimal2bin {

    public static void DicToBin(int deciNum){
        int Mynum = deciNum;
        int pow=0;
        int BinNum=0;
        while (deciNum>0){
            int rem=deciNum%2;
            BinNum=BinNum+(int)(rem*Math.pow(10, pow));
            pow++;
            deciNum=deciNum/2;
            

        }
       
      System.out.println("decimal of"+Mynum+" = "+ BinNum);
    }


    public static void main(String[] args) {
         DicToBin(12);
    }
}
