

public class recursion
 { 
    static void count(int[] arr, int i, int sum ,int k ,int [] ans, int size){
        if(i == arr.length){
            if (sum== k){
                for (int j=0; j<size;j++)
                {
                    System.out.println(ans[j] + " ");
                }
               System.out.println();
            }
            
            return;
        }
        ans[size] = arr[i];
        count(arr,i+1, sum+arr[i], k , ans , size+1);
        count(arr ,i+1,sum,k ,ans , size);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        int[] ans = new int[arr.length];

        count(arr, 0, 0, k, ans, 0);

        // int[] ans = new int [arr.length];
        // count(arr, i, ans, k);
    }
}
