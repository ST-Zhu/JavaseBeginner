/*2、定义一个学生类
属性包括：学生编号、学生姓名、学生年龄
属性私有化，对外提供公开的set和get方法
提供无参构造和有参数构造方法
提供一个display()方法，通过该方法打印学生信息。
编写测试程序创建对象，调用display()方法。*/

public class Main {
    public static void main(String[] args) {
        Student student = new Student("123456", "张三", 18);
        student.display();
    }
}

class Student{
    private String no;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public void display(){
        System.out.println("学生编号：" + getNo());
        System.out.println("学生姓名：" + getName());
        System.out.println("学生年龄：" + getAge());
    }
}