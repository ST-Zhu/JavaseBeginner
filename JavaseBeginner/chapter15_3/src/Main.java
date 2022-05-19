/*3、定义一个人类
属性包括：姓名、年龄、性别
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了

定义一个病毒类
属性包括：病毒名称name、病毒体积size、病毒类型type
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
在attack()方法中调用人对象的生病方法。

编写测试程序，创建病毒对象，创建人对象，模拟病毒攻击人。*/

public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三" , 18, "男");
        Bad bad = new Bad("感冒", 20, "普通性");
        bad.attack(person);
    }
}

class Person{
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void ill(){
        System.out.println(getName() + "生病了" + ",性别" + isSex() + ",年龄" + getAge() + "。");
    }
}

class Bad{
    private String name;
    private int size;
    private String type;

    public Bad() {
    }

    public Bad(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack(Person person){
        person.ill();
    }
}