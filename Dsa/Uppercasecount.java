

public class Uppercasecount {

    static int countUppercase(String str, int i) {
        // Base case
        if (i == str.length()) {
            return 0;
        }

        int count = 0;

        // Check uppercase
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            count = 1;
        }

        // Recursive call
        return count + countUppercase(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "HeLLo WoRLD";

        int result = countUppercase(str, 0);
        System.out.println("Uppercase count: " + result);
    }
}
