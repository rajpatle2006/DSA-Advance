 import java.util.Stack;
public class MaxMin {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int max =0;
        int min = st.peek();
        while(!st.isEmpty()) 
        {
            int a =st.pop();
            max = Math.max(max, a);
            min =Math.min(max, a);
         
        }
        System.out.println(st);
   System.out.println(max);
   System.out.println(min);
}
}
