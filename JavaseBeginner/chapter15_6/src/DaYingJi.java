public class DaYingJi implements InsertDrawable{
    public DaYingJi() {
    }

    @Override
    public void insert() {
        System.out.println("打印机插入");
    }

    @Override
    public void draw() {
        System.out.println("打印机拔出");
    }
}
