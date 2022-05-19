public class Text01{
	public static void main(String[] args){
		Person p = new Person();
		p.setName("张三");
		p.setSex(true);
		p.setAge(150);
		System.out.println("姓名：" + p.getName());
		System.out.println("性别：" + p.getSex());
		System.out.println("年龄：" + p.getAge());
	}
}
class Person{
	private String name;
	private boolean sex;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	public boolean getSex(){
		return this.sex;
	}
	public void setAge(int age){
		if((0 <= age) && (age <= 100)){
			this.age = age;
		}else{
			System.out.println("输入数字不合法，请输入0~100");
		}
		
	}
	public int getAge(){
		return this.age;
	}
	
	{
		System.out.println("A new class of person have been created.");
	}
	public Person(){}
	public Person(String name,boolean sex,int age){
		setName(name);
		setSex(sex);
		setAge(age);
	}
}