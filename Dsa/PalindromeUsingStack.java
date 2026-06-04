import java.util.Stack;
public class PalindromeUsingStack {
    public static void main(String[] args) {
        String str = "madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {      // Push all characters into stack
            stack.push(str.charAt(i));
        }

        String reversed = "";                          // Create reversed string using pop

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}