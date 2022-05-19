public class Subtract implements Compute {
    @Override
    public int computer(int n, int m) {
        if (n > m){
            return n - m;
        }else{
            return m - n;
        }
    }
}
