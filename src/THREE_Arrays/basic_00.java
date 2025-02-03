package THREE_Arrays;
import java.util.*;
public class basic_00 {
    public static void main(String[] args) {
        int arr[]= {0,1,2,3};
//        System.out.println(arr[3]);

        int marks[] = new int[100];

        System.out.println(marks.length);

        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Phy ="+marks[0]);
        System.out.println("Chem ="+marks[1]);
        System.out.println("Maths ="+marks[2]);

        marks[0] = marks[0] + 1;
        System.out.println("updated :"+marks[0]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage ="+percentage+"%");
    }
}
