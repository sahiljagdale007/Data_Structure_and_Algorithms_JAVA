package SIX_string;

public class substring_02 {
    public static String getsubString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        //substring
        String str = "Helloworld";
        System.out.println(getsubString(str, 0, 5));
    }
}
