public class Display implements  Functions {
    @Override
    public void function(Room room) {
        System.out.println("打印房间信息：");
        System.out.println("  房间编号：" + room.getNumber());
        System.out.println("  房间类型：" + room.getType());
        System.out.println("  房间状态：" + room.isFlag());
    }
}
