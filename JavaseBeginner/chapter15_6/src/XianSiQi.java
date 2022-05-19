public class XianSiQi implements InsertDrawable{
    public XianSiQi() {
    }

    @Override
    public void insert() {
        System.out.println("显示器插入");
    }

    @Override
    public void draw() {
        System.out.println("显示器拔出");
    }
}
