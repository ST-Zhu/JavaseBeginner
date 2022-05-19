/*第一题：定义猴子类，猴子有名字和性别等属性，并且定义猴子说话的方法，定义人类，人有
名字和性别等属性，并且定义人说话的方法。使用继承，让代码具有复用性。*/

public class Main {
    public static void main(String[] args) {
        Person p = new Person("张三", true);
        p.speak();
    }
}

class Monkey{
    private String name;
    private boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    {
        System.out.println("A new class of monkey has been created.");
    }

    public Monkey() {}

    public Monkey(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public void speak(){
        System.out.println(this.getName() + "is speaking.");
    }
}

class Person extends Monkey{
    {
        System.out.println("A new class of person has been created.");
    }

    public Person() {
    }

    public Person(String name, boolean sex) {
        super(name, sex);
    }

    public void speak(){
        System.out.println(this.getName() + "在说话。");
    }
}