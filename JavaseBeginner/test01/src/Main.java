import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] integers= {{1,1,1}, {2,2,2}, {3,3,3}};
        // function(integers); // 无法对数组进行自动装箱
    }

    public static void function(Integer[][] integers) {
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        arrayList.add(integers[0]);
        System.out.println(arrayList.get(0));
    }
}
