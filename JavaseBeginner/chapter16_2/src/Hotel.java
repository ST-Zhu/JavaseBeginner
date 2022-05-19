public class Hotel {
    private String name;
    private Room[][] room;

    public Hotel() {
    }

    public Hotel(String name, int heightNumber, int lengthNumber) {
        this.name = name;
        this.room = new Room[heightNumber][lengthNumber];
        //*****Room[][]框架建立了，但是Room类并未创建，数组里的元素为null*****
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[][] getRoom() {
        return room;
    }

    public void setRoom(Room[][] room) {
        this.room = room;
    }

    public void manage(Functions functions, Room room){
        functions.function(room);
    }
}
