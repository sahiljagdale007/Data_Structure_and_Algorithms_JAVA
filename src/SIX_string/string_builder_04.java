package SIX_string;

public class string_builder_04 {
    public static void main(String[]args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
