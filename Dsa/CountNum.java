
public class CountNum {
    // public class Main {

    static int count(int[] arr, int i, int sum, int k) {

        // base case
        if (i == arr.length) {
            if (sum == k) {
                return 1;   // valid subset mila
            }
            return 0;
        }

        // include current element
        int include = count(arr, i + 1, sum + arr[i], k);

        // exclude current element
        int exclude = count(arr, i + 1, sum, k);

        return include + exclude;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;

        int result = count(arr, 0, 0, k);

        System.out.println("Total subsets with sum " + k + " = " + result);
    }
}

