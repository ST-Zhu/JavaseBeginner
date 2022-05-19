/*第一题：
（1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
（2）定义接口B，里面包含抽象方法void setColor(String c)。
（3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
（4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
圆柱体的高height、颜色color。
（5）创建主类来测试类Cylinder。*/

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 10, "红色");
        System.out.println(cylinder.area());
        System.out.println(cylinder.getColor());
        System.out.println(cylinder.volume());
    }
}

