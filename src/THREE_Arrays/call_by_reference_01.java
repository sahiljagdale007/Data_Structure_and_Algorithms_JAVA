package THREE_Arrays;

public class call_by_reference_01 {
    public static void updateMarks(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {90,91,92};
        updateMarks(marks);
        for(int i=0; i< marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
