public class Tank extends MoveAttackWeapon {
    public Tank() {
    }

    public Tank(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + "发动炮击。");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + "通过履带移动。");
    }
}
