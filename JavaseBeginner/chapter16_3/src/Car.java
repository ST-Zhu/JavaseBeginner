public class Car extends MoveWeapon{
    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + "通过轮子移动。");
    }
}
