public class overloadingDataType {
    
    public static int sum (int x, int y) {
        return x + y;
    } 
    public static float sum (float x, float y, float z) {
        return x + y+ z;
    } 
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4.6f,5.5f,6.8f));
    }
}
