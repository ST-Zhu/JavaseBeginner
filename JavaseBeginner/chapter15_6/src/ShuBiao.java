public class ShuBiao implements InsertDrawable{
    public ShuBiao() {
    }

    @Override
    public void insert() {
        System.out.println("鼠标插入");
    }

    @Override
    public void draw() {
        System.out.println("鼠标拔出");
    }
}
