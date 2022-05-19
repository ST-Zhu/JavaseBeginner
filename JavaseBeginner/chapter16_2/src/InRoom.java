public class InRoom implements Functions {
    @Override
    public void function(Room room) {
        room.setFlag(true);
        System.out.println(room.getNumber() + "号" + room.getType() + "订房成功。");
    }
}
