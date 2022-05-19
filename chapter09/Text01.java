public class Text01{
	public static void main(String[] args){
		Husband h = new Husband("123456789","张三","1999-01-01");
		Wife w = new Wife("987654321","李四","1999-01-02");
		h.woman = w;
		w.man = h;
		System.out.println(h.woman.name + "的妻子是" + w.man.name);
	}
}
class Husband{
	String id;
	String name;
	String birthday;
	Wife woman;
	
	{
		System.out.println("A new class of husband have been creatd.");
	}
	public Husband(){}
	public Husband(String id,String name,String birthday){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	public Husband(String id,String name,String birthday,Wife woman){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.woman = woman;
	}
}
class Wife{
	String id;
	String name;
	String birthday;
	Husband man;
	
	{
		System.out.println("A new class of wife have been creatd.");
	}
	public Wife(){}
	public Wife(String id,String name,String birthday){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	public Wife(String id,String name,String birthday,Husband man){
		this(id,name,birthday);
		this.man = man;
	}
}