package EIGHT_recursion;

public class Binary_Stiring_No_One {
    public static void conesecutiveOne(int n,int lastPlace, String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }
        conesecutiveOne(n-1,0,str+"0");
        if(lastPlace==0) {
            conesecutiveOne(n-1, 1, str+"1");
        }
    }
    public static void main(String[]args) {
        conesecutiveOne(3,0,"");
    }
}
