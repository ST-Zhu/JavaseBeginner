public class OutRoom implements Functions {
    @Override
    public void function(Room room) {
        room.setFlag(false);
        System.out.println(room.getNumber() + "号" + room.getType() + "退房成功。");
    }
}
