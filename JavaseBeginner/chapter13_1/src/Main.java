/*第一题：实现愤怒的小鸟
我们有很多种小鸟，每种小鸟都有飞的行为，还有一个弹弓，弹弓有一个弹射的行为，
弹射时把小鸟弹出去，之后小鸟使用自己飞行的行为飞向小猪（不要求编写小猪的代码）。
不同种类的小鸟有不同飞行的方式：
红火：红色小鸟，飞行方式：正常
蓝冰：蓝色小鸟，飞行方式：分成 3 个
黄风：黄色小鸟，飞行方式：加速。*/

public class Main {
    public static void main(String[] args) {
        Dangong dangong = new Dangong();
        dangong.tanshe(new Honghuo());
        dangong.tanshe(new Lanbing());
        dangong.tanshe(new Huangfeng());
    }
}

class Dangong{
    public void tanshe(Brid brid){
        brid.fly();
    }
}

class Brid{
    private String color;

    public Brid() {
    }

    public Brid(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fly(){
        System.out.println(this.color + "的小鸟飞翔。");
    }
}

class Honghuo extends Brid{
    public Honghuo() {
        super("红色");
    }

    public void fly(){
        System.out.println(this.getColor() + "的红火正常飞翔。");
    }
}

class Lanbing extends Brid{
    public Lanbing() {
        super("蓝色");
    }

    public void fly(){
        System.out.println(this.getColor() + "的蓝冰分成三个飞翔。");
    }
}

class Huangfeng extends Brid{
    public Huangfeng() {
        super("黄色");
    }

    public void fly(){
        System.out.println(this.getColor() + "的黄风加速飞翔。");
    }
}