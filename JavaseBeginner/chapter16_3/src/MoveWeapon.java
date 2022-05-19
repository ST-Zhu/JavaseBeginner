public class MoveWeapon extends Weapon{
    public MoveWeapon() {
    }

    public MoveWeapon(String name) {
        super(name);
    }

    @Override
    public void attack() throws MyException {
        throw new MyException("该武器无法攻击。");
    }
}
