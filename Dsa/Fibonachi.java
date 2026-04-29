
// /fibonacci seres 0,1,2,5,8,13
public class Fibonachi {
    static int fifo(int n){
        if(n<=1)
            return n;
        return fifo(n-1) + fifo(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fifo(n));
        
    }
    
}
