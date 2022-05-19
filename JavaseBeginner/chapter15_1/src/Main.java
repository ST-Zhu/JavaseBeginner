/*1.定义一个用户类
要处理的信息有用户ID、用户密码、email地址。
属性私有化，对外提供公开的set和get方法
提供无参数构造方法
提供有参数构造方法
提供一个showInfo()方法，通过这个方法展示用户信息。
编写测试程序创建对象，调用showInfo()方法。*/

public class Main {
    public static void main(String[] args) {
        User user = new User("123", "123", "123");
        user.showInfo();
    }
}

class User{
    private String id;
    private String passworld;
    private String email;

    public User() {
    }

    public User(String id, String passworld, String email) {
        this.id = id;
        this.passworld = passworld;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showInfo(){
        System.out.println("该用户的ID：" + getId());
        System.out.println("该用户的密码：" + getPassworld());
        System.out.println("该用户的Email地址：" + getEmail());
    }
}