public class Computer {
    private InsertDrawable insertDrawable1;
    private InsertDrawable insertDrawable2;
    private InsertDrawable insertDrawable3;

    public Computer() {
    }

    public Computer(InsertDrawable insertDrawable1, InsertDrawable insertDrawable2, InsertDrawable insertDrawable3) {
        this.insertDrawable1 = insertDrawable1;
        this.insertDrawable2 = insertDrawable2;
        this.insertDrawable3 = insertDrawable3;
    }

    public InsertDrawable getInsertDrawable1() {
        return insertDrawable1;
    }

    public void setInsertDrawable1(InsertDrawable insertDrawable1) {
        this.insertDrawable1 = insertDrawable1;
    }

    public InsertDrawable getInsertDrawable2() {
        return insertDrawable2;
    }

    public void setInsertDrawable2(InsertDrawable insertDrawable2) {
        this.insertDrawable2 = insertDrawable2;
    }

    public InsertDrawable getInsertDrawable3() {
        return insertDrawable3;
    }

    public void setInsertDrawable3(InsertDrawable insertDrawable3) {
        this.insertDrawable3 = insertDrawable3;
    }

    void in(InsertDrawable insertDrawable, int count){
        switch (count){
            case 1:
                this.insertDrawable1 = insertDrawable;
                System.out.print("端口1：");
                break;
            case 2:
                this.insertDrawable2 = insertDrawable;
                System.out.print("端口2：");
                break;
            case 3:
                this.insertDrawable3 = insertDrawable;
                System.out.print("端口3：");
                break;
            default:
                System.out.println("请插入正确的端口。");
                return;
        }
        insertDrawable.insert();
    }

    void in(InsertDrawable insertDrawable1, int count1,InsertDrawable insertDrawable2, int count2){
        in(insertDrawable1, count1);
        in(insertDrawable2, count2);
    }

    void in(InsertDrawable insertDrawable1, int count1, InsertDrawable insertDrawable2, int count2, InsertDrawable insertDrawable3, int count3){
        in(insertDrawable1, count1);
        in(insertDrawable2, count2);
        in(insertDrawable3, count3);
    }

    void out(InsertDrawable insertDrawable){

        if (insertDrawable == this.insertDrawable1){
            this.insertDrawable1 = null;
            System.out.print("端口1：");
        }else if (insertDrawable == this.insertDrawable2){
            this.insertDrawable2 = null;
            System.out.print("端口2：");
        }else if (insertDrawable == this.insertDrawable3){
            this.insertDrawable3 = null;
            System.out.print("端口3：");
        }else{
            System.out.println("该设备未插入此电脑，请选择已插入此电脑的设备。");
            return;
        }
        insertDrawable.draw();
    }

    void out(InsertDrawable insertDrawable1, InsertDrawable insertDrawable2){
        out(insertDrawable1);
        out(insertDrawable2);
    }

    void out(InsertDrawable insertDrawable1, InsertDrawable insertDrawable2, InsertDrawable insertDrawable3){
        out(insertDrawable1);
        out(insertDrawable2);
        out(insertDrawable3);
    }
}
