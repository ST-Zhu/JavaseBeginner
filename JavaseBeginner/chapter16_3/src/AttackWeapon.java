public class AttackWeapon extends Weapon{
    public AttackWeapon() {
    }

    public AttackWeapon(String name) {
        super(name);
    }

    @Override
    public void move() throws MyException {
        throw new MyException("该武器无法移动。");
    }
}
