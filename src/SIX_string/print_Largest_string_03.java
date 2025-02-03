package SIX_string;

public class print_Largest_string_03 {
    public static void main(String[]args) {
        String fruits[] = {"apple","mango","banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i])<0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
