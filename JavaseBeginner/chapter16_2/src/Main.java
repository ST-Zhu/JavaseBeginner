/*第二题：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
	为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
	1、该系统的用户是：酒店前台。
	2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
	3、酒店中的每一个房间应该是一个java对象：Room
	4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
	5、系统应该对外提供的功能：
		可以预定房间：用户输入房间编号，订房。
		可以退房：用户输入房间编号，退房。
		可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。*/

public class Main {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("请输入正确的用户名密码格式。例如：张三 123");
            return;
        }
        String userName = args[0];
        String passWorld = args[1];
        if (!("酒店前台".equals(userName)) || !("123456".equals(passWorld))){
            System.out.println("账号不存在或密码错误，请输入正确的账号密码。");
            return;
        }

        System.out.println("欢迎用户“" + userName + "”进入系统。");

        Hotel hotel = initSystem();

        Functions inRoom = new InRoom();
        Functions outRoom = new OutRoom();
        Functions display = new Display();

        hotel.manage(inRoom, hotel.getRoom()[29][1]);
        hotel.manage(inRoom, hotel.getRoom()[29][2]);
        hotel.manage(inRoom, hotel.getRoom()[29][3]);

        hotel.manage(display, hotel.getRoom()[29][1]);
        hotel.manage(display, hotel.getRoom()[29][2]);
        hotel.manage(display, hotel.getRoom()[29][3]);

        hotel.manage(outRoom, hotel.getRoom()[29][1]);
        hotel.manage(outRoom, hotel.getRoom()[29][2]);
        hotel.manage(outRoom, hotel.getRoom()[29][3]);

        hotel.manage(display, hotel.getRoom()[29][1]);
        hotel.manage(display, hotel.getRoom()[29][2]);
        hotel.manage(display, hotel.getRoom()[29][3]);
    }

    static Hotel initSystem(){
        int heightNumber = 30;
        int lengthNumber = 100;
        Hotel hotel = new Hotel("天城国际大酒店", heightNumber, lengthNumber);

        for (int i = 0; i < heightNumber; i ++){
            for (int j = 0; j < lengthNumber; j ++){
                hotel.getRoom()[i][j] = new Room();
            }
        }//*****创建Room类，解决Room类的空指针异常*****

        int k = 0;
        for (int i = 0; i < heightNumber; i ++){
            for (int j = 0; j < lengthNumber; j ++){
                k ++;
                if ((1 <= k) && (k < 10)){
                    hotel.getRoom()[i][j].setNumber("8000" + k);

/*                    System.out.println(hotel.getRoom()[i][j]);
                    //*****以后遇到空指针异常，可以使用sout的方法打印引用变量，找到null。******/

                }else if ((10 <= k) && (k < 100)){
                    hotel.getRoom()[i][j].setNumber("800" + k);
                }else if ((100 <= k) && (k < 1000)){
                    hotel.getRoom()[i][j].setNumber("80" + k);
                }else if ((1000 <= k) && (k < 10000)){
                    hotel.getRoom()[i][j].setNumber("8" + k);
                }
            }
        }

        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < lengthNumber; j ++){
                hotel.getRoom()[i][j].setType("单人间");
            }
        }
        for (int i = 10; i < 20; i ++){
            for (int j = 0; j < lengthNumber; j ++){
                hotel.getRoom()[i][j].setType("双人间");
            }
        }
        for (int i = 20; i < 29; i ++){
            for (int j = 0; j < lengthNumber; j ++){
                hotel.getRoom()[i][j].setType("豪华房");
            }
        }
        for (int j = 0; j < lengthNumber; j ++){
            hotel.getRoom()[29][j].setType("总统房");
        }
        System.out.println("系统初始化完成。");

        return hotel;
    }

}
