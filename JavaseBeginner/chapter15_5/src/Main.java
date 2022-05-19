/*第二题：
在画图软件中，可以画出不同大小或颜色的圆形、矩形等几何图形。几何图形之间有许多共同的特征，如它们可以是用某种颜色画出来的，
可以是填充的或者不填充的。此外还有些不同的特征，比如，圆形都有半径，可以根据半径计算圆形的面积和周长，矩形都有宽和高，
可以根据宽高来计算矩形的面积和周长。
1、编写Java程序。
(1)使用继承机制，分别设计实现抽象类 图形类，子类类圆形类、正方形类、长方形类，要求：
①抽象类图形类中有属性包括画笔颜色(String类型)、图形是否填充(boolean类型：true表示填充，false表示不填充)，
有方法获取图形面积、获取图形周长等；
②使用构造方法为其属性赋初值；
③在每个子类中都重写toString()方法，返回所有属性的信息；
④根据文字描述合理设计子类的其他属性和方法。

(2)设计实现画板类，要求：
①画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
②画一个绿色、有填充、半径为3.0的圆形；
③画一个黄色、无填充、边长为4.0的正方形；
④分别求三个对象的面积和周长，并将每个对象的所有属性信息打印到控制台。*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("红色", false, 10.0F, 5.0F);
        Round round = new Round("绿色", true, 3.0F);
        Square square = new Square("黄色", false, 4.0F);

        Draw.draw(rectangle);
        Draw.draw(round);
        Draw.draw(square);
    }
}

class Draw{
    public static void draw(Image image){
        System.out.println(image.toString());
    }
}

abstract class Image{
    private String color;
    private boolean fill;

    public Image() {
    }

    public Image(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public abstract float area();
    public abstract float perimeter();
}

class Round extends Image{
    private float radius;
    private static float PI = 3.14F;

    public Round() {
    }

    public Round(String color, boolean fill, float radius) {
        super(color, fill);
        this.radius = radius;
    }

    @Override
    public float area() {
        return this.radius * this.radius * PI;
    }

    @Override
    public float perimeter() {
        return 2 * this.radius * PI;
    }

    @Override
    public String toString() {
        String world;

        if (this.isFill() == true){
            world = "填充";
        }else {
            world = "不填充";
        }

        return "圆的颜色为" + this.getColor() + "，" + world + "，半径为" + this.radius + "，面积为" + this.area() + "，周长为" + this.perimeter() + "。";
    }
}

class Square extends Image{
    private float length;

    public Square() {
    }

    public Square(String color, boolean fill, float length) {
        super(color, fill);
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float area() {
        return this.length * this.length;
    }

    @Override
    public float perimeter() {
        return 4 * this.length;
    }

    @Override
    public String toString() {
        String world;

        if (this.isFill() == true){
            world = "填充";
        }else {
            world = "不填充";
        }

        return "正方形的颜色为" + this.getColor() + "，" + world + "，边长为" + this.length + "，面积为" + this.area() + "，周长为" + this.perimeter() + "。";
    }
}

class Rectangle extends Image{
    private float length;
    private float height;

    public Rectangle() {
    }

    public Rectangle(String color, boolean fill, float length, float height) {
        super(color, fill);
        this.length = length;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float area() {
        return this.height * this.length;
    }

    @Override
    public float perimeter() {
        return 2 * (this.length + this.height);
    }

    @Override
    public String toString() {
        String world;

        if (this.isFill() == true){
            world = "填充";
        }else {
            world = "不填充";
        }

        return "长方形的颜色为" + this.getColor() + "，" + world + "，长为" + this.length + "，高为" + this.height + "，面积为" + this.area() + "，周长为" + this.perimeter() + "。";
    }
}



