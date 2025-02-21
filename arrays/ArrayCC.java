import java.util.*;

public class ArrayCC{
    public static void main(String[] args){
        //create
        int marks[]=new int[50];
        int number[]={1,2,3};
        String fruits[]={"apple", "orange", "grape"};
        //input
        
        Scanner scanner = new Scanner(System.in);
        marks[0]=scanner.nextInt();
        marks[1]=scanner.nextInt();
        marks[3]=scanner.nextInt();
        //output
        System.out.println("phy"+marks[0]);
        System.out.println("bio"+marks[1]);
        System.out.println("chem"+marks[3]);
        //update
        marks[3]=67;
        //marks.length and after compile the size decrease due to initailly created arry accupied
    }
}