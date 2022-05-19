/*第二题：定义动物类，动物有名字属性，并且定义动物移动的方法，定义鱼类，鱼有名字属性，
有颜色属性，并且定义鱼移动的方法。使用继承，让代码具有复用性。*/

public class Main {
    public static void main(String[] args) {
        Fish f = new Fish("小金", "金色");
        f.move();
    }
}

class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("A animal is moving.");
    }
}

class Fish extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fish() {
    }

    public Fish(String name, String color) {
        super(name);
        this.color = color;
    }

    public void move() {
        System.out.println(getColor() + "的" + getName() + "在游泳。");
    }
}
