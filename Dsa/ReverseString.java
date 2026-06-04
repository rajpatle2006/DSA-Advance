import java.util.Stack;
public class ReverseString {
    public static void main(String[] args) {
        String str = "COMPUTER";

        Stack<Character> st = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        // Pop characters and create reversed string
        String reverse = "";

        while (!st.isEmpty()) {
            reverse += st.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
    }
}
