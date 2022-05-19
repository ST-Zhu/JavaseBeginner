public class Gun extends AttackWeapon{
    public Gun() {
    }

    public Gun(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + "开始射击。");
    }
}
