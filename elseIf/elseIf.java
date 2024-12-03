public class elseIf {
    public static void main(String[] args) {
        int age =19;
        if(age>18){
            System.out.println("Adult");
        }
        else if(age>=13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("child");
        }
    }
}
