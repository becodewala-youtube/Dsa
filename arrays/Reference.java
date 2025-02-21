
public class Reference {
    public static void update (int marks[], int nonChangeable){
        nonChangeable = 10;
      for(int i=0; i<marks.length; i++){
        marks[i] = marks[i]+1;
     }
    }
    public static void main(String[] args) {
        int marks[]= {92,93,94};
        int nonChangeable = 5;
        update(marks,nonChangeable);
        System.out.println(nonChangeable);

        // print results
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
