package TEN_Backtracking;

//REMEMBER: Backtracking concept is happening in Call Stack.
//Everything is dependent is on choices in backtracking

public class Find_Subset_01 {
    public static void findSubset(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        findSubset(str, ans + str.charAt(i), i + 1);
        //no choice
        findSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
