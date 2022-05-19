/*第三题：某汽车租赁公司有多种汽车可以出租，计算汽车租金
Vehicle 是所有车的父类，属性：品牌、车牌号，有返回总租金的方法：public double
getSumRent(int days){}
小轿车类 Car 是 Vehicle 的子类，属性：车型（两厢、三厢、越野），两厢每天 300，
三厢每天 350，越野每天 500。
多座汽车类 Bus 是 Vehicle 的子类，属性：座位数，座位数<=16 的每天 400，座位数>16
的每天 600。
编写测试类，根据用户选择不同的汽车，计算总租金。*/

public class Main {
    public static void main(String[] args) {
        Rent rent = new Rent(10);
        System.out.println(rent.rent(new Car("沃尔沃", "鄂A 88888", "越野")));
        System.out.println(rent.rent(new Bus("奔驰", "鄂A 66666", 20)));
    }
}

class Rent{
    private int days;

    public Rent() {
    }

    public Rent(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double rent(Vehicle vehicle){
        return vehicle.getSumRent(this.days);
    }
}

/*Vehicle 是所有车的父类，属性：品牌、车牌号，有返回总租金的方法：public double
getSumRent(int days){}*/
class Vehicle{
    private String logo;
    private String number;

    public Vehicle() {
    }

    public Vehicle(String logo, String number) {
        this.logo = logo;
        this.number = number;
    }

    public String getlogo() {
        return logo;
    }

    public void setlogo(String logo) {
        this.logo = logo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getSumRent(int days){
        return 0;
    }
}

/*小轿车类 Car 是 Vehicle 的子类，属性：车型（两厢、三厢、越野），两厢每天 300，
三厢每天 350，越野每天 500。*/
class Car extends Vehicle{
    private String type;

    public Car() {
    }

    public Car(String logo, String number, String type) {
        super(logo, number);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSumRent(int days){
        int money = 0;
        switch(this.type){
            case "两厢": money = 300;break;
            case "三厢": money = 350;break;
            case "越野": money = 500;break;
            default:
                System.out.println("请输入正确的车型，例如：两厢、三厢、越野。");
        }
        return money * days;
    }
}

/*多座汽车类 Bus 是 Vehicle 的子类，属性：座位数，座位数<=16 的每天 400，座位数>16
的每天 600。*/
class Bus extends Vehicle{
    private int seat;

    public Bus() {
    }

    public Bus(String logo, String number, int seat) {
        super(logo, number);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getSumRent(int days){
        int money = 0;
        if(this.seat <= 16){
            money = 400;
        }else if(this.seat > 16){
            money = 600;
        }
        return money * days;
    }
}