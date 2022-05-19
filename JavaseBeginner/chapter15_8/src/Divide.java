public class Divide implements Compute {
    @Override
    public int computer(int n, int m) {
        if ((n == 0) && (m == 0)){
            System.out.print("请输入正确的数据类型");
            return 0;
        }
        if ((n == 0) && (m != 0)){
            return 0;
        }
        if ((m == 0) && (n != 0)){
            return 0;
        }

        return n / m;
    }
}
