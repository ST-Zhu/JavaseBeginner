public class Weapon {
    private String name;

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() throws MyException {
        if (this.name == null) {
            throw new MyException("此处没有武器，无法移动。");
        }
    }

    public void attack() throws MyException {
        if (this.name == null) {
            throw new MyException("此处没有武器，无法攻击。");
        }
    }
}
