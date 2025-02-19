package TEN_Backtracking;

public class Find_Permutations_02 {
    public static void findPermutations(String str, String ans) {
        //base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            str = str.substring(0, i) + str.substring(i+1, str.length());  //i will take previous all the elements, except i
            findPermutations(str,ans + curr);
        }
    }
    public static void main(String[]args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
