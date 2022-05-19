public class Room {
    private String number;
    private String type;
    private boolean flag;

    public Room() {
        this.flag = false;
    }

    public Room(String number, String type, boolean flag) {
        this.number = number;
        this.type = type;
        this.flag = flag;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
