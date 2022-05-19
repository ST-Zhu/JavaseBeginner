/* 开放型题目，随意发挥：
	写一个类Army,代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所拥有的所有武器），
	该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,
	并用这一大小来初始化数组w。

	该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
	在这个类中还定义两个方法attackAll()让w数组中的所有武器攻击；
	以及moveAll()让w数组中的所有可移动的武器移动。

	写一个主方法去测试以上程序。

	提示：
		Weapon是一个父类。应该有很多子武器。
		这些子武器应该有一些是可移动的，有一些
		是可攻击的。*/

/*优化：
*   1、使用异常：数组满、命令下达错误
*   2、删除武器方法*/

public class Main {
    public static void main(String[] args){
        Army army = new Army(20);

        try {
            army.addWeapon(new Tank("坦克1号"));
            army.addWeapon(new Tank("坦克2号"));
            army.addWeapon(new Tank("坦克3号"));
            army.addWeapon(new Car("装甲车1号"));
            army.addWeapon(new Car("装甲车2号"));
            army.addWeapon(new Car("装甲车3号"));
            army.addWeapon(new Gun("枪支1号"));
            army.addWeapon(new Gun("枪支2号"));
            army.addWeapon(new Gun("枪支3号"));
            army.addWeapon(new Gun("枪支4号"));
            army.addWeapon(new Gun("枪支5号"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        army.moveAll();
        army.attackAll();

        Gun gun6 = new Gun("枪支6号");
/*        try {
            army.addWeapon(gun6);
        } catch (MyException e) {
            e.printStackTrace();
        }*/
        try {
            army.deleteWeapon(gun6);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        /*System.out.println("========================");

        for (int i = 0; i < army.getW().length; i++) {
            try {
                army.getW()[i].move();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
            try {
                army.getW()[i].attack();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }*/

    }
}
