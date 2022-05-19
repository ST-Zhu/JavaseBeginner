public class JianPan implements InsertDrawable{
    public JianPan() {
    }

    @Override
    public void insert() {
        System.out.println("键盘插入");
    }

    @Override
    public void draw() {
        System.out.println("键盘拔出");
    }
}
